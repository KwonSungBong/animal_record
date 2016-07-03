package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAnimalRecord is a Querydsl query type for AnimalRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAnimalRecord extends EntityPathBase<AnimalRecord> {

    private static final long serialVersionUID = 324903112L;

    public static final QAnimalRecord animalRecord = new QAnimalRecord("animalRecord");

    public final com.springapp.mvc.business.domain.animal.base.QBaseRecord _super = new com.springapp.mvc.business.domain.animal.base.QBaseRecord(this);

    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = this.<AdditionRecord, QAdditionRecord>createList("additionRecords", AdditionRecord.class, QAdditionRecord.class, PathInits.DIRECT2);

    public final DatePath<java.time.LocalDate> birthday = createDate("birthday", java.time.LocalDate.class);

    public final StringPath description = createString("description");

    public final EnumPath<GenderEnum> genderType = createEnum("genderType", GenderEnum.class);

    //inherited
    public final NumberPath<Long> idx = _super.idx;

    public final StringPath kind = createString("kind");

    //inherited
    public final DatePath<java.time.LocalDate> modDate = _super.modDate;

    public final StringPath name = createString("name");

    //inherited
    public final DatePath<java.time.LocalDate> regDate = _super.regDate;

    public QAnimalRecord(String variable) {
        super(AnimalRecord.class, forVariable(variable));
    }

    public QAnimalRecord(Path<? extends AnimalRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAnimalRecord(PathMetadata<?> metadata) {
        super(AnimalRecord.class, metadata);
    }

}

