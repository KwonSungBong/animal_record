package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QReptiliaRecord is a Querydsl query type for ReptiliaRecord
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QReptiliaRecord extends EntityPathBase<ReptiliaRecord> {

    private static final long serialVersionUID = -1643389698L;

    public static final QReptiliaRecord reptiliaRecord = new QReptiliaRecord("reptiliaRecord");

    public final QAnimalRecord _super = new QAnimalRecord(this);

    //inherited
    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = _super.additionRecords;

    public final StringPath animalRecordTypeName = createString("animalRecordTypeName");

    //inherited
    public final DatePath<java.time.LocalDate> birthday = _super.birthday;

    //inherited
    public final StringPath description = _super.description;

    public final StringPath fear = createString("fear");

    public final StringPath feature = createString("feature");

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

    public final NumberPath<Integer> tailLength = createNumber("tailLength", Integer.class);

    public QReptiliaRecord(String variable) {
        super(ReptiliaRecord.class, forVariable(variable));
    }

    public QReptiliaRecord(Path<? extends ReptiliaRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QReptiliaRecord(PathMetadata<?> metadata) {
        super(ReptiliaRecord.class, metadata);
    }

}

