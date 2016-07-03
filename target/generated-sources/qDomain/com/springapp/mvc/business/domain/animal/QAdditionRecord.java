package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAdditionRecord is a Querydsl query type for AdditionRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAdditionRecord extends EntityPathBase<AdditionRecord> {

    private static final long serialVersionUID = -822500600L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdditionRecord additionRecord = new QAdditionRecord("additionRecord");

    public final com.springapp.mvc.business.domain.animal.base.QBaseRecord _super = new com.springapp.mvc.business.domain.animal.base.QBaseRecord(this);

    protected QAdditionRecordCategory additionRecordCategory;

    public final EnumPath<AdditionRecordStatusEnum> additionRecordStatus = createEnum("additionRecordStatus", AdditionRecordStatusEnum.class);

    public final EnumPath<AdditionRecordTypeEnum> additionRecordType = createEnum("additionRecordType", AdditionRecordTypeEnum.class);

    protected QAnimalRecord animalRecord;

    public final StringPath description = createString("description");

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    //inherited
    public final NumberPath<Long> idx = _super.idx;

    //inherited
    public final DatePath<java.time.LocalDate> modDate = _super.modDate;

    //inherited
    public final DatePath<java.time.LocalDate> regDate = _super.regDate;

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public QAdditionRecord(String variable) {
        this(AdditionRecord.class, forVariable(variable), INITS);
    }

    public QAdditionRecord(Path<? extends AdditionRecord> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdditionRecord(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QAdditionRecord(PathMetadata<?> metadata, PathInits inits) {
        this(AdditionRecord.class, metadata, inits);
    }

    public QAdditionRecord(Class<? extends AdditionRecord> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.additionRecordCategory = inits.isInitialized("additionRecordCategory") ? new QAdditionRecordCategory(forProperty("additionRecordCategory")) : null;
        this.animalRecord = inits.isInitialized("animalRecord") ? new QAnimalRecord(forProperty("animalRecord")) : null;
    }

    public QAdditionRecordCategory additionRecordCategory() {
        if (additionRecordCategory == null) {
            additionRecordCategory = new QAdditionRecordCategory(forProperty("additionRecordCategory"));
        }
        return additionRecordCategory;
    }

    public QAnimalRecord animalRecord() {
        if (animalRecord == null) {
            animalRecord = new QAnimalRecord(forProperty("animalRecord"));
        }
        return animalRecord;
    }

}

