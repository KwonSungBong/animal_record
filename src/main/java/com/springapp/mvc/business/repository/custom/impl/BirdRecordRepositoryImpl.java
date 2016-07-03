package com.springapp.mvc.business.repository.custom.impl;

import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.business.repository.custom.CustomAmphibianRecordRepository;
import com.springapp.mvc.business.repository.custom.CustomBirdRecordRepository;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;

import static com.springapp.mvc.business.domain.animal.QBirdRecord.birdRecord;

public class BirdRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomBirdRecordRepository {

    public BirdRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public long updateOne(BirdRecord animalRecord, long animalRecordIdx) {
        return update(birdRecord)
                .where(birdRecord.idx.eq(animalRecordIdx))
                .set(birdRecord.modDate, animalRecord.getModDate())
                .set(birdRecord.name, animalRecord.getName())
                .set(birdRecord.kind, animalRecord.getKind())
                .set(birdRecord.genderType, animalRecord.getGenderType())
                .set(birdRecord.sense, animalRecord.getSense())
                .set(birdRecord.wingspan, animalRecord.getWingspan())
                .set(birdRecord.beakLength, animalRecord.getBeakLength())
                .execute();
    }
}
