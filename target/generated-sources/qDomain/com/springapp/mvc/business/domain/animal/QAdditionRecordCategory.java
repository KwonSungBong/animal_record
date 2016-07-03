package com.springapp.mvc.business.domain.animal;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QAdditionRecordCategory is a Querydsl query type for AdditionRecordCategory
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAdditionRecordCategory extends EntityPathBase<AdditionRecordCategory> {

    private static final long serialVersionUID = 27737126L;

    public static final QAdditionRecordCategory additionRecordCategory = new QAdditionRecordCategory("additionRecordCategory");

    public final com.springapp.mvc.business.domain.animal.base.QBaseRecordCategory _super = new com.springapp.mvc.business.domain.animal.base.QBaseRecordCategory(this);

    public final EnumPath<AdditionRecordCategoryTypeEnum> additionRecordCategoryTypeEnum = createEnum("additionRecordCategoryTypeEnum", AdditionRecordCategoryTypeEnum.class);

    public final ListPath<AdditionRecord, QAdditionRecord> additionRecords = this.<AdditionRecord, QAdditionRecord>createList("additionRecords", AdditionRecord.class, QAdditionRecord.class, PathInits.DIRECT2);

    public final StringPath description = createString("description");

    //inherited
    public final NumberPath<Long> idx = _super.idx;

    public final StringPath name = createString("name");

    public QAdditionRecordCategory(String variable) {
        super(AdditionRecordCategory.class, forVariable(variable));
    }

    public QAdditionRecordCategory(Path<? extends AdditionRecordCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAdditionRecordCategory(PathMetadata<?> metadata) {
        super(AdditionRecordCategory.class, metadata);
    }

}

