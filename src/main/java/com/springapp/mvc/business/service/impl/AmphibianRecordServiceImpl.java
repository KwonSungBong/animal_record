package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AmphibianRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.repository.AmphibianRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AmphibianRecordServiceImpl implements AnimalRecordByTypeService {

    @Autowired
    private AmphibianRecordRepository amphibianRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        amphibianRecordRepository.save((AmphibianRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        amphibianRecordRepository.updateOne((AmphibianRecord)animalRecord, animalRecordIdx);
    }
}
