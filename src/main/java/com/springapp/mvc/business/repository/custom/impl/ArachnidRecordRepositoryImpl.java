package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.repository.custom.CustomArachnidRecordRepository;
import com.springapp.mvc.business.repository.custom.CustomInsectRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;

import static com.springapp.mvc.business.domain.animal.QArachnidRecord.arachnidRecord;

public class ArachnidRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomArachnidRecordRepository {

    public ArachnidRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(ArachnidRecord animalRecord, long animalRecordIdx) {
        return update(arachnidRecord)
                .where(arachnidRecord.idx.eq(animalRecordIdx))
                .set(arachnidRecord.modDate, animalRecord.getModDate())
                .set(arachnidRecord.name, animalRecord.getName())
                .set(arachnidRecord.kind, animalRecord.getKind())
                .set(arachnidRecord.genderType, animalRecord.getGenderType())
                .set(arachnidRecord.pedipalpLength, animalRecord.getPedipalpLength())
                .set(arachnidRecord.firstLegLength, animalRecord.getFirstLegLength())
                .set(arachnidRecord.secondLegLength, animalRecord.getSecondLegLength())
                .set(arachnidRecord.thirdLegLength, animalRecord.getThirdLegLength())
                .set(arachnidRecord.forthLegLength, animalRecord.getForthLegLength())
                .execute();
    }
}
