package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomAdditionRecordRepository {
    List<AdditionRecord> findList(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, Pageable pageable);
    AdditionRecord findOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, long additionRecordIdx);
    long deleteOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, long additionRecordIdx);
    long updateOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, long additionRecordIdx, AdditionRecord additionRecord);
}
