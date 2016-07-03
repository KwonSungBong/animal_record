package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import com.springapp.mvc.business.repository.MammaliaRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MammaliaRecordServiceImpl implements AnimalRecordByTypeService {

    @Autowired
    private MammaliaRecordRepository mammaliaRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        mammaliaRecordRepository.save((MammaliaRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        mammaliaRecordRepository.updateOne((MammaliaRecord)animalRecord, animalRecordIdx);
    }
}
