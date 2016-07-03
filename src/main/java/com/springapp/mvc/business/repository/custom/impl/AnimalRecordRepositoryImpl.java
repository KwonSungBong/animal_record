package com.springapp.mvc.business.repository.custom.impl;

import com.mysema.query.jpa.JPQLQuery;
import com.springapp.mvc.business.domain.animal.AnimalRecord;
import com.springapp.mvc.business.domain.animal.AnimalRecordTypeEnum;
import com.springapp.mvc.business.repository.custom.CustomAnimalRecordRepository;
import com.springapp.mvc.business.search.AnimalRecordSearchCondition;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;

import java.util.List;
import java.util.Optional;

import static com.springapp.mvc.business.domain.animal.QAnimalRecord.animalRecord;

public class AnimalRecordRepositoryImpl extends QueryDslRepositorySupport implements CustomAnimalRecordRepository {

    public AnimalRecordRepositoryImpl() {
        super(AnimalRecord.class);
    }

    @Override
    public List<AnimalRecord> findList(AnimalRecordSearchCondition animalRecordSearchCondition, Pageable pageable) {
        String name = Optional.ofNullable(animalRecordSearchCondition.getName()).orElse(StringUtils.EMPTY);

        JPQLQuery query = from(animalRecord)
                .where(animalRecord.name.contains(name));

        return getQuerydsl().applyPagination(pageable,query).list(animalRecord);
    }

    @Override
    public List<AnimalRecord> findList(AnimalRecordSearchCondition animalRecordSearchCondition, AnimalRecordTypeEnum animalRecordType, Pageable pageable) {
        String name = Optional.ofNullable(animalRecordSearchCondition.getName()).orElse(StringUtils.EMPTY);

        JPQLQuery query = from(animalRecord)
                .where(animalRecord.name.contains(name))
                .where(animalRecord.instanceOfAny(animalRecordType.getAnimalRecordTypeClass()));

        return getQuerydsl().applyPagination(pageable,query).list(animalRecord);
    }

    @Override
    public AnimalRecord findOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx) {
        JPQLQuery query = from(animalRecord)
                .where(animalRecord.instanceOfAny(animalRecordType.getAnimalRecordTypeClass()))
                .where(animalRecord.idx.eq(animalRecordIdx));

        return query.uniqueResult(animalRecord);
    }

    @Override
    public long deleteOne(AnimalRecordTypeEnum animalRecordType, long animalRecordIdx) {
        return delete(animalRecord)
                .where(animalRecord.instanceOfAny(animalRecordType.getAnimalRecordTypeClass()))
                .where(animalRecord.idx.eq(animalRecordIdx))
                .execute();
    }
}
