package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QInsectRecord is a Querydsl query type for InsectRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QInsectRecord extends EntityPathBase<InsectRecord> {

    private static final long serialVersionUID = -1332088140L;

    public static final QInsectRecord insectRecord = new QInsectRecord("insectRecord");

    public final QAnimalRecord _super = new QAnimalRecord(this);

    //inherited
    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = _super.additionRecords;

    public final StringPath animalRecordTypeName = createString("animalRecordTypeName");

    //inherited
    public final DatePath<java.time.LocalDate> birthday = _super.birthday;

    //inherited
    public final StringPath description = _super.description;

    public final StringPath feeler = createString("feeler");

    //inherited
    public final EnumPath<GenderEnum> genderType = _super.genderType;

    //inherited
    public final NumberPath<Long> idx = _super.idx;

    //inherited
    public final StringPath kind = _super.kind;

    public final StringPath mesothorax = createString("mesothorax");

    public final StringPath metathorax = createString("metathorax");

    //inherited
    public final DatePath<java.time.LocalDate> modDate = _super.modDate;

    //inherited
    public final StringPath name = _super.name;

    public final StringPath prothorax = createString("prothorax");

    //inherited
    public final DatePath<java.time.LocalDate> regDate = _super.regDate;

    public QInsectRecord(String variable) {
        super(InsectRecord.class, forVariable(variable));
    }

    public QInsectRecord(Path<? extends InsectRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInsectRecord(PathMetadata<?> metadata) {
        super(InsectRecord.class, metadata);
    }

}

