package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QFishRecord is a Querydsl query type for FishRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QFishRecord extends EntityPathBase<FishRecord> {

    private static final long serialVersionUID = -1776324892L;

    public static final QFishRecord fishRecord = new QFishRecord("fishRecord");

    public final QAnimalRecord _super = new QAnimalRecord(this);

    //inherited
    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = _super.additionRecords;

    public final StringPath animalRecordTypeName = createString("animalRecordTypeName");

    //inherited
    public final DatePath<java.time.LocalDate> birthday = _super.birthday;

    //inherited
    public final StringPath description = _super.description;

    public final StringPath fin = createString("fin");

    //inherited
    public final EnumPath<GenderEnum> genderType = _super.genderType;

    public final StringPath gill = createString("gill");

    //inherited
    public final NumberPath<Long> idx = _super.idx;

    //inherited
    public final StringPath kind = _super.kind;

    //inherited
    public final DatePath<java.time.LocalDate> modDate = _super.modDate;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final DatePath<java.time.LocalDate> regDate = _super.regDate;

    public QFishRecord(String variable) {
        super(FishRecord.class, forVariable(variable));
    }

    public QFishRecord(Path<? extends FishRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFishRecord(PathMetadata<?> metadata) {
        super(FishRecord.class, metadata);
    }

}

