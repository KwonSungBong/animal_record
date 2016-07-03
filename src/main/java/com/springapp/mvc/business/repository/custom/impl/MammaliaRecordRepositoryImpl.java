package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.repository.custom.CustomMammaliaRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;

import static com.springapp.mvc.business.domain.animal.QMammaliaRecord.mammaliaRecord;

public class MammaliaRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomMammaliaRecordRepository {

    public MammaliaRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(MammaliaRecord animalRecord, long animalRecordIdx) {
        return update(mammaliaRecord)
                .where(mammaliaRecord.idx.eq(animalRecordIdx))
                .set(mammaliaRecord.modDate, animalRecord.getModDate())
                .set(mammaliaRecord.name, animalRecord.getName())
                .set(mammaliaRecord.kind, animalRecord.getKind())
                .set(mammaliaRecord.genderType, animalRecord.getGenderType())
                .set(mammaliaRecord.weight, animalRecord.getWeight())
                .execute();
    }
}
