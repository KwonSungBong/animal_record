package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.domain.animal.AmphibianRecord;
import com.springapp.mvc.business.domain.animal.QAmphibianRecord;
import com.springapp.mvc.business.repository.custom.CustomAmphibianRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import static com.springapp.mvc.business.domain.animal.QAmphibianRecord.amphibianRecord;

public class AmphibianRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomAmphibianRecordRepository {

    public AmphibianRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(AmphibianRecord animalRecord, long animalRecordIdx) {
        return update(amphibianRecord)
                .where(amphibianRecord.idx.eq(animalRecordIdx))
                .set(amphibianRecord.modDate, animalRecord.getModDate())
                .set(amphibianRecord.name, animalRecord.getName())
                .set(amphibianRecord.kind, animalRecord.getKind())
                .set(amphibianRecord.genderType, animalRecord.getGenderType())
                .set(amphibianRecord.habitat, animalRecord.getHabitat())
                .execute();
    }
}
