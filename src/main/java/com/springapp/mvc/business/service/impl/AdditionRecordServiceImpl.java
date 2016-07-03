package com.springapp.mvc.business.service.impl;

import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import com.springapp.mvc.business.repository.AdditionRecordRepository;
import com.springapp.mvc.business.service.AdditionRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdditionRecordServiceImpl implements AdditionRecordService {

    @Autowired
    private AdditionRecordRepository additionRecordRepository;

    public List<AdditionRecord> getAdditionRecords(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx,
            Pageable pageable){
        return additionRecordRepository.findList(animalRecordType, animalRecordIdx, pageable);
    }

    public AdditionRecord getAdditionRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx,
            int additionRecordIdx){
        return additionRecordRepository.findOne(animalRecordType, animalRecordIdx, additionRecordIdx);
    }

    public void saveAdditionRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdxReply,
            AdditionRecord additionRecord){
        additionRecord.setAnimalRecord(animalRecordType.getAnimalRecordTypeInstance(animalRecordIdxReply));
        additionRecordRepository.save(additionRecord);
    }

    public void updateAdditionRecord(AnimalRecordTypeEnum animalRecordType,
                                     int animalRecordIdx,
                                     int additionRecordIdx,
                                     AdditionRecord additionRecord){
        additionRecordRepository.updateOne(animalRecordType, animalRecordIdx, additionRecordIdx, additionRecord);
    }

    public void deleteAdditionRecord(
            AnimalRecordTypeEnum animalRecordType,
            int animalRecordIdx,
            int additionRecordIdx){
        additionRecordRepository.deleteOne(animalRecordType, animalRecordIdx, additionRecordIdx);
    }
}
