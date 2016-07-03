package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.ArachnidRecord;
import com.springapp.mvc.business.repository.AmphibianRecordRepository;
import com.springapp.mvc.business.repository.ArachnidRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import com.springapp.mvc.business.service.AnimalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArachnidRecordServiceImpl implements AnimalRecordByTypeService {

    @Autowired
    private ArachnidRecordRepository arachnidRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        arachnidRecordRepository.save((ArachnidRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        arachnidRecordRepository.updateOne((ArachnidRecord)animalRecord, animalRecordIdx);
    }
}
