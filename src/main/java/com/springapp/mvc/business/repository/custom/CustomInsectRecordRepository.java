package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.InsectRecord;

public interface CustomInsectRecordRepository {
    long updateOne(InsectRecord animalRecord, long animalRecordIdx);
}
