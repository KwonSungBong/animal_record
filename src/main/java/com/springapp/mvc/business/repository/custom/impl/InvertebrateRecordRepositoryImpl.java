package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.repository.custom.CustomFishRecordRepository;
import com.springapp.mvc.business.repository.custom.CustomInvertebrateRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;

import static com.springapp.mvc.business.domain.animal.QInvertebrateRecord.invertebrateRecord;

public class InvertebrateRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomInvertebrateRecordRepository {

    public InvertebrateRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(InvertebrateRecord animalRecord, long animalRecordIdx) {
        return update(invertebrateRecord)
                .where(invertebrateRecord.idx.eq(animalRecordIdx))
                .set(invertebrateRecord.modDate, animalRecord.getModDate())
                .set(invertebrateRecord.name, animalRecord.getName())
                .set(invertebrateRecord.kind, animalRecord.getKind())
                .set(invertebrateRecord.genderType, animalRecord.getGenderType())
                .set(invertebrateRecord.spineNumber, animalRecord.getSpineNumber())
                .execute();
    }
}
