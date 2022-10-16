package com.teillet.betgames.match;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.teillet.betgames.match.dto.pandascore.PandaScoreMatch;
import com.teillet.betgames.match.dto.pandascore.UpdateMatch;
import com.teillet.betgames.parameter.ParameterEnum;
import com.teillet.betgames.parameter.Parameter;
import com.teillet.betgames.parameter.ParameterRepository;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class MatchService {
    private final Logger logger = LoggerFactory.getLogger(MatchService.class);
    private final MatchRepository matchRepository;
    private final ParameterRepository parameterRepository;
    @Value("pandascore.token.header")
    private String TOKEN_HEADER;

    public MatchService(MatchRepository matchRepository, ParameterRepository parameterRepository) {
        this.parameterRepository = parameterRepository;
        this.matchRepository = matchRepository;
    }

    public void loadAllPastMatch() {
        logger.info("Loading all past matches");

        OkHttpClient client = new OkHttpClient();

        List<PandaScoreMatch> pandaScoreMatchesComplete = new ArrayList<>();

        int page = 1;
        Integer maxPage = null;
        do {
            HttpUrl url = Objects.requireNonNull(HttpUrl.parse("https://api.pandascore.co/lol/matches/past")).newBuilder()
                    .addQueryParameter("page[size]", "100")
                    .addQueryParameter("page[number]", String.valueOf(page))
                    .build();

            maxPage = callUrlAndExploreAllPages(client, pandaScoreMatchesComplete, maxPage, url);
        } while (maxPage != null && page++ < maxPage);

        logger.info("Found {} matches", pandaScoreMatchesComplete.size());
        logger.info("Saving matches to database");

        List<Match> matchList = convertPandaScoreMatchesToMatches(pandaScoreMatchesComplete);

        matchRepository.saveAll(matchList);

    }

    private List<Match> convertPandaScoreMatchesToMatches(List<PandaScoreMatch> pandaScoreMatches) {
        logger.info("Converting PandaScore matches to matches");
        return pandaScoreMatches.parallelStream().map(this::convertPandaScoreMatchToMatch).toList();
    }

    private Match convertPandaScoreMatchToMatch(PandaScoreMatch pandaScoreMatch) {
        Match match = new Match();
        match.setMatchId(Long.valueOf(pandaScoreMatch.getId()));
        match.setSport(SportEnum.LOL);
        match.setLeague(pandaScoreMatch.getLeague().getName());
        if (pandaScoreMatch.getOpponents().size() == 2) {
            match.setTeamA(pandaScoreMatch.getOpponents().get(0).getOpponent().getName());
            match.setTeamB(pandaScoreMatch.getOpponents().get(1).getOpponent().getName());
        }
        match.setCote(0f);
        match.setStatus(StatusMatchEnum.valueOf(pandaScoreMatch.getStatus().toUpperCase()));
        if (pandaScoreMatch.getWinner() != null) {
            match.setWinnerTeam(pandaScoreMatch.getWinner().getName());
        }
        match.setDate(pandaScoreMatch.getScheduledAt());
        return match;
    }

    public void loadComingMatches2Weeks() {
        logger.info("Loading coming matches two weeks");

        Date twoWeeksLater = new Date();
        twoWeeksLater.setTime(twoWeeksLater.getTime() + (1000 * 60 * 60 * 24 * 14));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String twoWeeksLaterString = df.format(twoWeeksLater);

        Date now = new Date();
        String nowString = df.format(now);

        OkHttpClient client = new OkHttpClient();

        List<PandaScoreMatch> pandaScoreMatchesComplete = new ArrayList<>();
        int page = 1;
        Integer maxPage = null;
        do {
            HttpUrl url = Objects.requireNonNull(HttpUrl.parse("https://api.pandascore.co/lol/matches/upcoming")).newBuilder()
                    .addQueryParameter("range[begin_at]", nowString + "," + twoWeeksLaterString)
                    .addQueryParameter("page[size]", "100")
                    .addQueryParameter("page[number]", String.valueOf(page))
                    .build();

            maxPage = callUrlAndExploreAllPages(client, pandaScoreMatchesComplete, maxPage, url);
        } while (maxPage != null && page++ < maxPage);

        logger.info("Found {} matches", pandaScoreMatchesComplete.size());
        logger.info("Saving matches to database");

        List<Match> matchList = convertPandaScoreMatchesToMatches(pandaScoreMatchesComplete);

        matchRepository.saveAll(matchList);
    }

    public void loadResult3Hours() {
        logger.info("Loading last 3 hours result matches");

        Date threeHoursLater = new Date();
        threeHoursLater.setTime(threeHoursLater.getTime() + (1000 * 60 * 60 * 10));
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String threeHoursLaterString = df.format(threeHoursLater);
        String nowString = df.format(new Date());
        OkHttpClient client = new OkHttpClient();
        List<PandaScoreMatch> pandaScoreMatchesComplete = new ArrayList<>();
        int page = 1;
        Integer maxPage = null;
        do {
            HttpUrl url = Objects.requireNonNull(HttpUrl.parse("https://api.pandascore.co/lol/matches/past")).newBuilder()
                    .addQueryParameter("range[begin_at]", threeHoursLaterString + "," + nowString)
                    .addQueryParameter("page[size]", "100")
                    .addQueryParameter("page[number]", String.valueOf(page))
                    .build();

            maxPage = callUrlAndExploreAllPages(client, pandaScoreMatchesComplete, maxPage, url);
        } while (maxPage != null && page++ < maxPage);
        logger.info("Found {} matches", pandaScoreMatchesComplete.size());
        logger.info("Saving matches to database");
        List<Match> matchList = convertPandaScoreMatchesToMatches(pandaScoreMatchesComplete);
        matchRepository.saveAll(matchList);
    }

    @Nullable
    private Integer callUrlAndExploreAllPages(OkHttpClient client, List<PandaScoreMatch> pandaScoreMatchesComplete, Integer maxPage, HttpUrl url) {
        Request requestHttp = new Request.Builder()
                .url(url)
                .get()
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer " + TOKEN_HEADER)
                .build();

        try (Response responseHttp = client.newCall(requestHttp).execute()) {
            logger.info("Calling url {}", url);
            ObjectMapper mapper = new ObjectMapper();
            String json = responseHttp.body().string();
            List<PandaScoreMatch> pandaScoreMatches = mapper.readValue(json, new TypeReference<List<PandaScoreMatch>>() {
            });
            logger.info("Found {} pandaScoreMatches", pandaScoreMatches.size());
            pandaScoreMatchesComplete.addAll(pandaScoreMatches);
            if (maxPage == null && responseHttp.header("Link") != null) {
                String[] splitLink = Objects.requireNonNull(responseHttp.header("Link")).split(",");
                String last = splitLink[0].split(";")[0].replace("<", "").replace(">", "");
                HttpUrl lastUrl = HttpUrl.parse(last);
                maxPage = Integer.parseInt(lastUrl.queryParameter("page"));
                logger.info("Max page: {}", maxPage);
            }
        } catch (IOException e) {
            logger.error("Error {}", e.getMessage());
        }
        return maxPage;
    }

    public void updateMatches() {
        Parameter parameter = parameterRepository.findByName(ParameterEnum.LAST_UPDATE);
//        if (parameter == null || parameter.getValue().equals("")){
//            logger.info("No last update parameter found");
//            parameter.setName(ParameterEnum.LAST_UPDATE);
//            parameter.setValue(new Date());
//            parameterRepository.save(parameter);
//        }
        Date lastUpdate = parameter.getValue();
        logger.info("Last update: {}", lastUpdate);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String lastUpdateString = df.format(lastUpdate);
        OkHttpClient client = new OkHttpClient();
        List<UpdateMatch> updateMatches = new ArrayList<>();
        int page = 1;
        Integer maxPage = null;
        do {
            HttpUrl url = Objects.requireNonNull(HttpUrl.parse("https://api.pandascore.co/incidents")).newBuilder()
                    .addQueryParameter("page[size]", "100")
                    .addQueryParameter("type", "match")
                    .addQueryParameter("since", lastUpdateString)
                    .addQueryParameter("page[number]", String.valueOf(page))
                    .build();

            Request requestHttp = new Request.Builder()
                    .url(url)
                    .get()
                    .addHeader("Accept", "application/json")
                    .addHeader("Authorization", "Bearer " + TOKEN_HEADER)
                    .build();

            try (Response responseHttp = client.newCall(requestHttp).execute()) {
                logger.info("Calling url {}", url);
                ObjectMapper mapper = new ObjectMapper();
                String json = responseHttp.body().string();
                List<UpdateMatch> pandaScoreMatches = mapper.readValue(json, new TypeReference<List<UpdateMatch>>() {
                });
                logger.info("Found {} pandaScoreMatches", pandaScoreMatches.size());
                updateMatches.addAll(pandaScoreMatches);
                if (maxPage == null && responseHttp.header("Link") != null) {
                    String[] splitLink = Objects.requireNonNull(responseHttp.header("Link")).split(",");
                    String last = splitLink[0].split(";")[0].replace("<", "").replace(">", "");
                    HttpUrl lastUrl = HttpUrl.parse(last);
                    maxPage = Integer.parseInt(lastUrl.queryParameter("page"));
                    logger.info("Max page: {}", maxPage);
                }
            } catch (IOException e) {
                logger.error("Error {}", e.getMessage());
            }
        } while (maxPage != null && page++ < maxPage);
        logger.info("Found {} matches", updateMatches.size());
        logger.info("Saving matches to database");
        for (UpdateMatch updateMatch : updateMatches) {
            switch (updateMatch.getType()) {
                case "deletion" -> matchRepository.deleteById(Long.valueOf(updateMatch.getObject().getId()));
                case "update" -> {
                    Match match = matchRepository.findByMatchId(Long.valueOf(updateMatch.getObject().getId()));
                    match.setDate(updateMatch.getObject().getScheduledAt());
                    match.setWinnerTeam(updateMatch.getObject().getWinner().getName());
                    match.setStatus(StatusMatchEnum.valueOf(updateMatch.getObject().getStatus().toUpperCase()));
                    if (updateMatch.getObject().getOpponents().size() == 1) {
                        match.setTeamA(updateMatch.getObject().getOpponents().get(0).getOpponent().getName());
                    }
                    if (updateMatch.getObject().getOpponents().size() == 2) {
                        match.setTeamB(updateMatch.getObject().getOpponents().get(1).getOpponent().getName());
                    }
                    if (match.getTeamA() != null && match.getTeamB() != null && match.getStatus() == StatusMatchEnum.NOT_STARTED && (match.getCote() == 0f || match.getCote() == null)) {
                        computeCote(match);
                    }
                }
                case "creation" -> {
                    Match match1 = convertPandaScoreMatchToMatch(updateMatch.getObject());
                    if (match1.getTeamA() != null && match1.getTeamB() != null && match1.getStatus() == StatusMatchEnum.NOT_STARTED && (match1.getCote() == 0f || match1.getCote() == null)) {
                        computeCote(match1);
                    }
                }
            }
        }

        //matchRepository.saveAll(matchList);
        parameter.setValue(new Date());
        parameterRepository.save(parameter);

    }

    private void computeCote(Match match) {
        //Calcul Cote
//        func calculCote(equipeA string, equipeB string) float32 {
//            if equipeA == "" || equipeB == "" {
//                return 1
//            }
//            nbMatchTotal := nbMatchTotal(equipeA, equipeB)
//            if nbMatchTotal == -1 {
//                return 1
//            }
//            nbMatchGagneA := nbMatchGagne(equipeA, equipeB)
//            if nbMatchGagneA == -1 {
//                return 1
//            }
//            nbMatchGagne5DerniersA := nbMatchGagne5Derniers(equipeA, equipeB)
//            if nbMatchGagne5DerniersA == -1 {
//                return 1
//            }
//
//            pourcentageVictoireTotale := (float32(nbMatchGagneA)/float32(nbMatchTotal))/2 + (float32(nbMatchGagne5DerniersA)/5)/2
//            return 100 / pourcentageVictoireTotale
//        }


    }

}
