package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.AmphibianRecord;

public interface CustomAmphibianRecordRepository {
    long updateOne(AmphibianRecord animalRecord, long animalRecordIdx);
}
