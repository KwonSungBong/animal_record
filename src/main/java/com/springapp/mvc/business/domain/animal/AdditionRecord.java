package com.springapp.mvc.business.domain.animal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.springapp.mvc.business.domain.animal.base.BaseRecord;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AdditionRecord extends BaseRecord {
    private String description;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate startDate;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private AdditionRecordStatusEnum additionRecordStatus;

    @Enumerated(EnumType.STRING)
    private AdditionRecordTypeEnum additionRecordType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "additionRecordCategoryIdx")
    private AdditionRecordCategory additionRecordCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "animalRecordIdx")
    private AnimalRecord animalRecord;
}
