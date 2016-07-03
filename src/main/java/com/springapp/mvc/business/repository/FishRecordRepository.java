package com.springapp.mvc.business.repository;

import com.springapp.mvc.business.domain.animal.FishRecord;
import com.springapp.mvc.business.repository.custom.CustomFishRecordRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FishRecordRepository extends JpaRepository<FishRecord, Long>, CustomFishRecordRepository {
}
