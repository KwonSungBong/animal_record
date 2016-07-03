package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.INSECT_RECORD_TYPE)
public class InsectRecord extends AnimalRecord {
    public InsectRecord(long id){
        super(id);
    }

    private String feeler;
    private String prothorax;
    private String mesothorax;
    private String metathorax;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.INSECT.getName();
    }
}
