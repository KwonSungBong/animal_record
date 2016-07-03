package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.InsectRecord;
import com.springapp.mvc.business.repository.custom.CustomInsectRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsectRecordRepository extends JpaRepository<InsectRecord, Long>, CustomInsectRecordRepository {
}
