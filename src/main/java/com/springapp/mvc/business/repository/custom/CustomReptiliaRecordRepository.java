package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.ReptiliaRecord;

public interface CustomReptiliaRecordRepository {
    long updateOne(ReptiliaRecord animalRecord, long animalRecordIdx);
}
