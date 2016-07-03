package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.ArachnidRecord;

public interface CustomArachnidRecordRepository {
    long updateOne(ArachnidRecord animalRecord, long animalRecordIdx);
}
