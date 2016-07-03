package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.repository.custom.CustomBirdRecordRepository;
import com.springapp.mvc.business.repository.custom.CustomInsectRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;

import static com.springapp.mvc.business.domain.animal.QInsectRecord.insectRecord;

public class InsectRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomInsectRecordRepository {

    public InsectRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(InsectRecord animalRecord, long animalRecordIdx) {
        return update(insectRecord)
                .where(insectRecord.idx.eq(animalRecordIdx))
                .set(insectRecord.modDate, animalRecord.getModDate())
                .set(insectRecord.name, animalRecord.getName())
                .set(insectRecord.kind, animalRecord.getKind())
                .set(insectRecord.genderType, animalRecord.getGenderType())
                .set(insectRecord.feeler, animalRecord.getFeeler())
                .set(insectRecord.prothorax, animalRecord.getProthorax())
                .set(insectRecord.mesothorax, animalRecord.getMesothorax())
                .set(insectRecord.metathorax, animalRecord.getMetathorax())
                .execute();
    }
}
