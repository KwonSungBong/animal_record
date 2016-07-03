package com.springapp.mvc.business.service;

import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdditionRecordService {
    List<AdditionRecord> getAdditionRecords(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx,
            Pageable pageable);

    AdditionRecord getAdditionRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx,
            int additionRecordIdx);

    void saveAdditionRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdxReply,
            AdditionRecord additionRecord);

    void updateAdditionRecord(AnimalRecordTypeEnum animalRecordType,
                              int animalRecordIdx,
                              int additionRecordIdx,
                              AdditionRecord additionRecord);

    void deleteAdditionRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx,
            int additionRecordIdx);
}
