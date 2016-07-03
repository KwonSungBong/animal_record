package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.repository.custom.CustomArachnidRecordRepository;
import com.springapp.mvc.business.repository.custom.CustomReptiliaRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;

import static com.springapp.mvc.business.domain.animal.QReptiliaRecord.reptiliaRecord;

public class ReptiliaRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomReptiliaRecordRepository {

    public ReptiliaRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(ReptiliaRecord animalRecord, long animalRecordIdx) {
        return update(reptiliaRecord)
                .where(reptiliaRecord.idx.eq(animalRecordIdx))
                .set(reptiliaRecord.modDate, animalRecord.getModDate())
                .set(reptiliaRecord.name, animalRecord.getName())
                .set(reptiliaRecord.kind, animalRecord.getKind())
                .set(reptiliaRecord.genderType, animalRecord.getGenderType())
                .set(reptiliaRecord.fear, animalRecord.getFear())
                .set(reptiliaRecord.feature, animalRecord.getFeature())
                .set(reptiliaRecord.tailLength, animalRecord.getTailLength())
                .execute();
    }
}
