package com.springapp.mvc.business.domain.animal.base;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBaseRecordCategory is a Querydsl query type for BaseRecordCategory
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QBaseRecordCategory extends EntityPathBase<BaseRecordCategory> {

    private static final long serialVersionUID = 1089384930L;

    public static final QBaseRecordCategory baseRecordCategory = new QBaseRecordCategory("baseRecordCategory");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public QBaseRecordCategory(String variable) {
        super(BaseRecordCategory.class, forVariable(variable));
    }

    public QBaseRecordCategory(Path<? extends BaseRecordCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseRecordCategory(PathMetadata<?> metadata) {
        super(BaseRecordCategory.class, metadata);
    }

}

