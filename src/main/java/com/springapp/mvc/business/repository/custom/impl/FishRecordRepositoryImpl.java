package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.repository.custom.CustomFishRecordRepository;
import com.springapp.mvc.business.repository.custom.CustomReptiliaRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;

import static com.springapp.mvc.business.domain.animal.QFishRecord.fishRecord;

public class FishRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomFishRecordRepository {

    public FishRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(FishRecord animalRecord, long animalRecordIdx) {
        return update(fishRecord)
                .where(fishRecord.idx.eq(animalRecordIdx))
                .set(fishRecord.modDate, animalRecord.getModDate())
                .set(fishRecord.name, animalRecord.getName())
                .set(fishRecord.kind, animalRecord.getKind())
                .set(fishRecord.genderType, animalRecord.getGenderType())
                .set(fishRecord.fin, animalRecord.getFin())
                .set(fishRecord.gill, animalRecord.getGill())
                .execute();
    }
}
