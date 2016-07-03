package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBirdRecord is a Querydsl query type for BirdRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBirdRecord extends EntityPathBase<BirdRecord> {

    private static final long serialVersionUID = -1988128635L;

    public static final QBirdRecord birdRecord = new QBirdRecord("birdRecord");

    public final QAnimalRecord _super = new QAnimalRecord(this);

    //inherited
    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = _super.additionRecords;

    public final StringPath animalRecordTypeName = createString("animalRecordTypeName");

    public final NumberPath<Integer> beakLength = createNumber("beakLength", Integer.class);

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

    public final StringPath sense = createString("sense");

    public final NumberPath<Integer> wingspan = createNumber("wingspan", Integer.class);

    public QBirdRecord(String variable) {
        super(BirdRecord.class, forVariable(variable));
    }

    public QBirdRecord(Path<? extends BirdRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBirdRecord(PathMetadata<?> metadata) {
        super(BirdRecord.class, metadata);
    }

}

