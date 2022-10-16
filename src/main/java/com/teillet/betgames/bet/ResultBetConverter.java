package com.teillet.betgames.bet;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ResultBetConverter implements AttributeConverter<ResultBetEnum, String> {

    @Override
    public String convertToDatabaseColumn(ResultBetEnum attribute) {
        return attribute.getValue();
    }

    @Override
    public ResultBetEnum convertToEntityAttribute(String dbData) {
        return ResultBetEnum.valueOf(dbData);
    }
}
