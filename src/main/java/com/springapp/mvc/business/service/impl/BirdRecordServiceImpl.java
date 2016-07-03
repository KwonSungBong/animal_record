package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.BirdRecord;
import com.springapp.mvc.business.repository.ArachnidRecordRepository;
import com.springapp.mvc.business.repository.BirdRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import com.springapp.mvc.business.service.AnimalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@Service
@Transactional
public class BirdRecordServiceImpl implements AnimalRecordByTypeService {
    @Autowired
    private BirdRecordRepository birdRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        birdRecordRepository.save((BirdRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        birdRecordRepository.updateOne((BirdRecord)animalRecord, animalRecordIdx);
    }
}
