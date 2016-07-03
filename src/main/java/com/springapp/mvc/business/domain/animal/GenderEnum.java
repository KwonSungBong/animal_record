package com.springapp.mvc.business.domain.animal;

import com.springapp.mvc.business.domain.animal.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum GenderEnum implements BaseEnum  {
    MALE("수컷"),
    FEMALE("암컷");

    private String name;
}
