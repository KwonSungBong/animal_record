package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.repository.custom.CustomAdditionRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdditionRecordRepository extends JpaRepository<AdditionRecord, Long>, CustomAdditionRecordRepository {
}
