package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.REPTILIA_RECORD_TYPE)
public class ReptiliaRecord extends AnimalRecord {

    public ReptiliaRecord(long id){
        super(id);
    }

    private String fear;

    private String feature;

    private int tailLength;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.REPTILIA.getName();
    }
}
