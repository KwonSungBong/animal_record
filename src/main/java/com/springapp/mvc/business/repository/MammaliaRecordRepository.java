package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import com.springapp.mvc.business.repository.custom.CustomMammaliaRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MammaliaRecordRepository extends JpaRepository<MammaliaRecord, Long>, CustomMammaliaRecordRepository {
}
