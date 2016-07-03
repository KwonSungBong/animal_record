package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.FishRecord;
import com.springapp.mvc.business.repository.FishRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FishRecordServiceImpl implements AnimalRecordByTypeService {

    @Autowired
    private FishRecordRepository fishRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        fishRecordRepository.save((FishRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        fishRecordRepository.updateOne((FishRecord)animalRecord, animalRecordIdx);
    }
}
