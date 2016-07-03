package com.springapp.mvc.business.repository.custom.impl;

import com.mysema.query.jpa.JPQLQuery;
import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import com.springapp.mvc.business.domain.animal.QAdditionRecord;
import com.springapp.mvc.business.repository.custom.CustomAdditionRecordRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.time.LocalDate;
import java.util.List;

import static com.springapp.mvc.business.domain.animal.QAdditionRecord.additionRecord;
import static com.springapp.mvc.business.domain.animal.QAnimalRecord.animalRecord;

public class AdditionRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomAdditionRecordRepository {

    public AdditionRecordRepositoryImpl() {
        super(AdditionRecord.class);
    }

    @Override
    public List<AdditionRecord> findList(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, Pageable pageable) {
        JPQLQuery query = from(additionRecord)
                .join(additionRecord.animalRecord(), animalRecord).fetch()
                .where(additionRecord.animalRecord().instanceOfAny(animalRecordType.getAnimalRecordTypeClass()))
                .where(additionRecord.animalRecord().idx.eq(animalRecordIdx));

        return getQuerydsl().applySorting(pageable.getSort(), query).list(additionRecord);
    }

    @Override
    public AdditionRecord findOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, long additionRecordIdx) {
        JPQLQuery query = from(additionRecord)
                .join(additionRecord.animalRecord(), animalRecord).fetch()
                .where(additionRecord.animalRecord().instanceOfAny(animalRecordType.getAnimalRecordTypeClass()))
                .where(additionRecord.animalRecord().idx.eq(animalRecordIdx))
                .where(additionRecord.idx.eq(additionRecordIdx));

        return query.uniqueResult(additionRecord);
    }

    @Override
    public long deleteOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, long additionRecordIdx) {
        return delete(additionRecord)
                .where(additionRecord.animalRecord().instanceOfAny(animalRecordType.getAnimalRecordTypeClass()))
                .where(additionRecord.animalRecord().idx.eq(animalRecordIdx))
                .where(additionRecord.idx.eq(additionRecordIdx))
                .execute();
    }

    @Override
    public long updateOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx, long additionRecordIdx, AdditionRecord additionRecord) {
        return update(QAdditionRecord.additionRecord)
                .where(QAdditionRecord.additionRecord.animalRecord().instanceOfAny(animalRecordType.getAnimalRecordTypeClass()))
                .where(QAdditionRecord.additionRecord.animalRecord().idx.eq(animalRecordIdx))
                .where(QAdditionRecord.additionRecord.idx.eq(additionRecordIdx))
                .set(QAdditionRecord.additionRecord.description, additionRecord.getDescription())
                .set(QAdditionRecord.additionRecord.startDate, additionRecord.getStartDate())
                .set(QAdditionRecord.additionRecord.endDate, additionRecord.getEndDate())
                .set(QAdditionRecord.additionRecord.modDate, additionRecord.getModDate())
                .set(QAdditionRecord.additionRecord.additionRecordStatus, additionRecord.getAdditionRecordStatus())
                .set(QAdditionRecord.additionRecord.additionRecordType, additionRecord.getAdditionRecordType())
                .set(QAdditionRecord.additionRecord.additionRecordCategory(), additionRecord.getAdditionRecordCategory())
                .execute();
    }
}
