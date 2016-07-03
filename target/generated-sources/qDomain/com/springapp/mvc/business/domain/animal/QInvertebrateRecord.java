package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QInvertebrateRecord is a Querydsl query type for InvertebrateRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QInvertebrateRecord extends EntityPathBase<InvertebrateRecord> {

    private static final long serialVersionUID = 1859596191L;

    public static final QInvertebrateRecord invertebrateRecord = new QInvertebrateRecord("invertebrateRecord");

    public final QAnimalRecord _super = new QAnimalRecord(this);

    //inherited
    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = _super.additionRecords;

    public final StringPath animalRecordTypeName = createString("animalRecordTypeName");

    //inherited
    public final DatePath<java.time.LocalDate> birthday = _super.birthday;

    //inherited
    public final StringPath description = _super.description;

    //inherited
    public final EnumPath<GenderEnum> genderType = _super.genderType;

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

    public final NumberPath<Integer> spineNumber = createNumber("spineNumber", Integer.class);

    public QInvertebrateRecord(String variable) {
        super(InvertebrateRecord.class, forVariable(variable));
    }

    public QInvertebrateRecord(Path<? extends InvertebrateRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInvertebrateRecord(PathMetadata<?> metadata) {
        super(InvertebrateRecord.class, metadata);
    }

}

