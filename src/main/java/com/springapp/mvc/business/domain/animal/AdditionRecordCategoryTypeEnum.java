package com.springapp.mvc.business.domain.animal;

import com.springapp.mvc.business.domain.animal.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum AdditionRecordCategoryTypeEnum implements BaseEnum {
    CATEGORY_1("CATEGORY_1"),
    CATEGORY_2("CATEGORY_2"),
    CATEGORY_3("CATEGORY_3"),
    CATEGORY_4("CATEGORY_4"),
    CATEGORY_5("CATEGORY_5");

    private String name;
}
