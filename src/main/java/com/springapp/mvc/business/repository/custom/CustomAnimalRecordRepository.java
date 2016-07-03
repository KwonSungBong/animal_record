package com.springapp.mvc.business.repository.custom;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import com.springapp.mvc.business.search.AnimalRecordSearchCondition;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomAnimalRecordRepository {
    List<AnimalRecord> findList(AnimalRecordSearchCondition animalRecordSearchCondition, Pageable pageable);
    List<AnimalRecord> findList(AnimalRecordSearchCondition animalRecordSearchCondition, AnimalRecordTypeEnum animalRecordType, Pageable pageable);
    AnimalRecord findOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx);
    long deleteOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx);
}
