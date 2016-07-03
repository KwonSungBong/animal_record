package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QArachnidRecord is a Querydsl query type for ArachnidRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QArachnidRecord extends EntityPathBase<ArachnidRecord> {

    private static final long serialVersionUID = 928144704L;

    public static final QArachnidRecord arachnidRecord = new QArachnidRecord("arachnidRecord");

    public final QAnimalRecord _super = new QAnimalRecord(this);

    //inherited
    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = _super.additionRecords;

    public final StringPath animalRecordTypeName = createString("animalRecordTypeName");

    //inherited
    public final DatePath<java.time.LocalDate> birthday = _super.birthday;

    //inherited
    public final StringPath description = _super.description;

    public final NumberPath<Integer> firstLegLength = createNumber("firstLegLength", Integer.class);

    public final NumberPath<Integer> forthLegLength = createNumber("forthLegLength", Integer.class);

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

    public final NumberPath<Integer> pedipalpLength = createNumber("pedipalpLength", Integer.class);

    //inherited
    public final DatePath<java.time.LocalDate> regDate = _super.regDate;

    public final NumberPath<Integer> secondLegLength = createNumber("secondLegLength", Integer.class);

    public final NumberPath<Integer> thirdLegLength = createNumber("thirdLegLength", Integer.class);

    public QArachnidRecord(String variable) {
        super(ArachnidRecord.class, forVariable(variable));
    }

    public QArachnidRecord(Path<? extends ArachnidRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArachnidRecord(PathMetadata<?> metadata) {
        super(ArachnidRecord.class, metadata);
    }

}

