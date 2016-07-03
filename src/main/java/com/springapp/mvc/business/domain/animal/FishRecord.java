package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.FISH_RECORD_TYPE)
public class FishRecord extends AnimalRecord {
    public FishRecord(long id){
        super(id);
    }

    private String fin;
    private String gill;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.FISH.getName();
    }
}
