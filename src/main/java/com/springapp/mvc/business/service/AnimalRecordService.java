package com.springapp.mvc.business.service;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import com.springapp.mvc.business.search.AnimalRecordSearchCondition;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AnimalRecordService {
    List<AnimalRecord> getAnimalRecords(
        AnimalRecordSearchCondition animalRecordSearchCondition,
        Pageable pageable);

    List<AnimalRecord> getAnimalRecords(
            AnimalRecordSearchCondition animalRecordSearchCondition,
            AnimalRecordTypeEnum animalRecordType,
            Pageable pageable);

    AnimalRecord getAnimalRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx);

    void deleteAnimalRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx);
}
