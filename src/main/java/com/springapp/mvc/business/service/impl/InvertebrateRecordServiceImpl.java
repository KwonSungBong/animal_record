package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.InvertebrateRecord;
import com.springapp.mvc.business.repository.InsectRecordRepository;
import com.springapp.mvc.business.repository.InvertebrateRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import com.springapp.mvc.business.service.AnimalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InvertebrateRecordServiceImpl implements AnimalRecordByTypeService {

    @Autowired
    private InvertebrateRecordRepository invertebrateRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        invertebrateRecordRepository.save((InvertebrateRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        invertebrateRecordRepository.updateOne((InvertebrateRecord)animalRecord, animalRecordIdx);
    }
}
