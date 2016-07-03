package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.InvertebrateRecord;
import com.springapp.mvc.business.repository.custom.CustomInvertebrateRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvertebrateRecordRepository extends JpaRepository<InvertebrateRecord, Long>, CustomInvertebrateRecordRepository {
}
