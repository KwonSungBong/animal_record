package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.BIRD_RECORD_TYPE)
public class BirdRecord extends AnimalRecord {
    public BirdRecord(long id){
        super(id);
    }

    private String sense;
    private int wingspan;
    private int beakLength;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.BIRD.getName();
    }
}
