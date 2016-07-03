package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.ReptiliaRecord;
import com.springapp.mvc.business.repository.custom.CustomReptiliaRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReptiliaRecordRepository extends JpaRepository<ReptiliaRecord, Long>, CustomReptiliaRecordRepository {
}
