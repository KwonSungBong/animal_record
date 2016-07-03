package com.springapp.mvc.component.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

@Converter
public class YearMonthConverter implements AttributeConverter<YearMonth, String> {
    private final static String YEAR_MONTH_REGEXP = "[0-9]{4,4}-[0-9]{2,2}";

    @Override
    public String convertToDatabaseColumn(YearMonth yearMonth) {
        return yearMonth.toString();
    }

    @Override
    public YearMonth convertToEntityAttribute(String yearMonthString) {
        if(yearMonthString != null && Pattern.matches(YEAR_MONTH_REGEXP, yearMonthString)){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM");
            YearMonth yearMonth = YearMonth.parse(yearMonthString, formatter);
            return yearMonth;
        } else {
            return null;
        }
    }
}
