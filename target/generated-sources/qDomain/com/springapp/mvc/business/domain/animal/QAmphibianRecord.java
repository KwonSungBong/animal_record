package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAmphibianRecord is a Querydsl query type for AmphibianRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAmphibianRecord extends EntityPathBase<AmphibianRecord> {

    private static final long serialVersionUID = -59576721L;

    public static final QAmphibianRecord amphibianRecord = new QAmphibianRecord("amphibianRecord");

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

    public final StringPath habitat = createString("habitat");

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

    public QAmphibianRecord(String variable) {
        super(AmphibianRecord.class, forVariable(variable));
    }

    public QAmphibianRecord(Path<? extends AmphibianRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAmphibianRecord(PathMetadata<?> metadata) {
        super(AmphibianRecord.class, metadata);
    }

}

