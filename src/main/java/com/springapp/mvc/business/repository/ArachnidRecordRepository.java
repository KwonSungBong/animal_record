package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.ArachnidRecord;
import com.springapp.mvc.business.repository.custom.CustomArachnidRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArachnidRecordRepository extends JpaRepository<ArachnidRecord, Long>, CustomArachnidRecordRepository {
}
