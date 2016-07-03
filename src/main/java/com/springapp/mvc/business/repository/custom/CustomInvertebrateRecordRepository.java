package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.InvertebrateRecord;

public interface CustomInvertebrateRecordRepository {
    long updateOne(InvertebrateRecord animalRecord, long animalRecordIdx);
}
