package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.BirdRecord;
import com.springapp.mvc.business.repository.custom.CustomBirdRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BirdRecordRepository extends JpaRepository<BirdRecord, Long>, CustomBirdRecordRepository {
}
