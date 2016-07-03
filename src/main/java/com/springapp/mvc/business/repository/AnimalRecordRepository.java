package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.repository.custom.CustomAnimalRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRecordRepository extends JpaRepository<AnimalRecord, Long>, CustomAnimalRecordRepository {
}
