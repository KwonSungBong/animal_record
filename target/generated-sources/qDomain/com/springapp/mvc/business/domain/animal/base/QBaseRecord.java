package com.springapp.mvc.business.domain.animal.base;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBaseRecord is a Querydsl query type for BaseRecord
 */
@Generated("com.mysema.query.codegen.SupertypeSerializer")
public class QBaseRecord extends EntityPathBase<BaseRecord> {

    private static final long serialVersionUID = -1518299964L;

    public static final QBaseRecord baseRecord = new QBaseRecord("baseRecord");

    public final NumberPath<Long> idx = createNumber("idx", Long.class);

    public final DatePath<java.time.LocalDate> modDate = createDate("modDate", java.time.LocalDate.class);

    public final DatePath<java.time.LocalDate> regDate = createDate("regDate", java.time.LocalDate.class);

    public QBaseRecord(String variable) {
        super(BaseRecord.class, forVariable(variable));
    }

    public QBaseRecord(Path<? extends BaseRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBaseRecord(PathMetadata<?> metadata) {
        super(BaseRecord.class, metadata);
    }

}

