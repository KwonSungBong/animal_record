package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.ReptiliaRecord;
import com.springapp.mvc.business.repository.MammaliaRecordRepository;
import com.springapp.mvc.business.repository.ReptiliaRecordRepository;
import com.springapp.mvc.business.service.AnimalRecordByTypeService;
import com.springapp.mvc.business.service.AnimalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ReptiliaRecordServiceImpl implements AnimalRecordByTypeService {

    @Autowired
    private ReptiliaRecordRepository reptiliaRecordRepository;

    @Override
    public void saveAnimalRecord(AnimalRecord animalRecord) {
        reptiliaRecordRepository.save((ReptiliaRecord)animalRecord);
    }

    @Override
    public void updateAnimalRecord(int animalRecordIdx, AnimalRecord animalRecord) {
        reptiliaRecordRepository.updateOne((ReptiliaRecord)animalRecord, animalRecordIdx);
    }
}
