package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.MAMMALIA_RECORD_TYPE)
public class MammaliaRecord extends AnimalRecord {

    public MammaliaRecord(long id){
        super(id);
    }

    private int weight;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.MAMMALIA.getName();
    }
}
