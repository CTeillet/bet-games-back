package com.teillet.betgames.converter;

import com.teillet.betgames.enums.StatusMatchEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class StatusMatchConverter implements AttributeConverter<StatusMatchEnum, String> {

    @Override
    public String convertToDatabaseColumn(StatusMatchEnum attribute) {
        return attribute.getValue();
    }

    @Override
    public StatusMatchEnum convertToEntityAttribute(String dbData) {
        return StatusMatchEnum.valueOf(dbData);
    }

}
