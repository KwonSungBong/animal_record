package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.InsectRecord;
import com.springapp.mvc.business.repository.InsectRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InsectRecordServiceImpl implements AnimalRecordByTypeService {

    @Autowired
    private InsectRecordRepository insectRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        insectRecordRepository.save((InsectRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        insectRecordRepository.updateOne((InsectRecord)animalRecord, animalRecordIdx);
    }
}
