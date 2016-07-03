package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.FishRecord;

public interface CustomFishRecordRepository {
    long updateOne(FishRecord animalRecord, long animalRecordIdx);
}
