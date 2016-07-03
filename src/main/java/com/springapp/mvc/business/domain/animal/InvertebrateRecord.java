package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.INVERTEBRATE_RECORD_TYPE)
public class InvertebrateRecord extends AnimalRecord {
    public InvertebrateRecord(long id){
        super(id);
    }

    private int spineNumber;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.INVERTEBRATE.getName();
    }
}
