package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.BirdRecord;

public interface CustomBirdRecordRepository {
    long updateOne(BirdRecord animalRecord, long animalRecordIdx);
}
