package com.teillet.betgames.converter;


import com.teillet.betgames.enums.ParameterEnum;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class ParameterEnumConverter implements AttributeConverter<ParameterEnum, String> {

    @Override
    public String convertToDatabaseColumn(ParameterEnum attribute) {
        return attribute.getValue();
    }

    @Override
    public ParameterEnum convertToEntityAttribute(String dbData) {
        return ParameterEnum.valueOf(dbData);
    }
}
