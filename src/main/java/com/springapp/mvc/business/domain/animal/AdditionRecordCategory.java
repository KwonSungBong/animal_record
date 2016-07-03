package com.springapp.mvc.business.domain.animal;

import com.springapp.mvc.business.domain.animal.base.BaseRecordCategory;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdditionRecordCategory extends BaseRecordCategory {
    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private AdditionRecordCategoryTypeEnum additionRecordCategoryTypeEnum;

    @OneToMany(mappedBy = "additionRecordCategory", fetch = FetchType.LAZY)
    private List<AdditionRecord> additionRecords;
}
