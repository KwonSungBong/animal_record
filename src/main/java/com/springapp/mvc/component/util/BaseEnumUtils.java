package com.springapp.mvc.component.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import com.springapp.mvc.business.domain.animal.base.BaseEnum;
import org.apache.commons.lang3.EnumUtils;

import java.util.Map;
import java.util.stream.Collectors;

public class BaseEnumUtils {
    static public String getEnumToJsonString(Class enumClass) throws JsonProcessingException {
        return new ObjectMapper().writeValueAsString(getEnumToMap(enumClass));
    }

    static public Map<String, String> getEnumToMap(Class enumClass) throws JsonProcessingException {
        Map<String, BaseEnum> enumMap = EnumUtils.getEnumMap(enumClass);
        Map<String, String> baseTypeEnumMap = enumMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getName()));
        return baseTypeEnumMap;
    }
}
