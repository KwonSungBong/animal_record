package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import com.springapp.mvc.business.repository.AnimalRecordRepository;
import com.springapp.mvc.business.search.AnimalRecordSearchCondition;
import com.springapp.mvc.business.service.AnimalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnimalRecordServiceImpl implements AnimalRecordService {

    @Autowired
    private AnimalRecordRepository animalRecordRepository;

    public List<AnimalRecord> getAnimalRecords(
            AnimalRecordSearchCondition animalRecordSearchCondition,
            Pageable pageable){
        return animalRecordRepository.findList(animalRecordSearchCondition, pageable);
    }

    public List<AnimalRecord> getAnimalRecords(
            AnimalRecordSearchCondition animalRecordSearchCondition,
            AnimalRecordTypeEnum animalRecordType,
            Pageable pageable){
        return animalRecordRepository.findList(animalRecordSearchCondition, animalRecordType, pageable);
    }

    public AnimalRecord getAnimalRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx){
        return animalRecordRepository.findOne(animalRecordType, animalRecordIdx);
    }

    public void deleteAnimalRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx){
        animalRecordRepository.deleteOne(animalRecordType,animalRecordIdx);
    }
}
