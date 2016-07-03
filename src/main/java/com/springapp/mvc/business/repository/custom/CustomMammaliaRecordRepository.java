package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.MammaliaRecord;

public interface CustomMammaliaRecordRepository {
    long updateOne(MammaliaRecord animalRecord, long animalRecordIdx);
}
