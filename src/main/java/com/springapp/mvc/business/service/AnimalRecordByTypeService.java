package com.springapp.mvc.business.service;

import com.springapp.mvc.business.domain.animal.AnimalRecord;

public interface AnimalRecordByTypeService {
    void saveAnimalRecord(
            AnimalRecord animalRecord);

    void updateAnimalRecord(int animalRecordIdx,
                              AnimalRecord animalRecord);
}
