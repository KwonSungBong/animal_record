package com.springapp.mvc.business.domain.animal;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@DiscriminatorValue(AnimalRecordTypeEnum.AMPHIBIAN_RECORD_TYPE)
public class AmphibianRecord extends AnimalRecord {
    public AmphibianRecord(long id){
        super(id);
    }

    private String habitat;

    @Override
    public String getAnimalRecordTypeName() {
        return AnimalRecordTypeEnum.AMPHIBIAN.getName();
    }
}
