package com.springapp.mvc.business.domain.animal;

import com.springapp.mvc.business.domain.animal.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum AdditionRecordTypeEnum implements BaseEnum {
    A("A"),
    B("B"),
    C("C"),
    D("D"),
    E("E"),
    F("F");

    private String name;
}
