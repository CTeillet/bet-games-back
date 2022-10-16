package com.teillet.betgames.match;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class SportEnumConverter implements AttributeConverter<SportEnum, String> {

    @Override
    public String convertToDatabaseColumn(SportEnum attribute) {
        return attribute.getValue();
    }

    @Override
    public SportEnum convertToEntityAttribute(String dbData) {
        return SportEnum.valueOf(dbData);
    }

}
