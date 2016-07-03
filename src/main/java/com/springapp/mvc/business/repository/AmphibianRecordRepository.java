package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.AmphibianRecord;
import com.springapp.mvc.business.repository.custom.CustomAmphibianRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AmphibianRecordRepository extends JpaRepository<AmphibianRecord, Long>, CustomAmphibianRecordRepository {
}
