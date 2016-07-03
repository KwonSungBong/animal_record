package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.ARACHNID_RECORD_TYPE)
public class ArachnidRecord extends AnimalRecord {
    public ArachnidRecord(long id){
        super(id);
    }

    private int pedipalpLength;
    private int firstLegLength;
    private int secondLegLength;
    private int thirdLegLength;
    private int forthLegLength;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.ARACHNID.getName();
    }
}
