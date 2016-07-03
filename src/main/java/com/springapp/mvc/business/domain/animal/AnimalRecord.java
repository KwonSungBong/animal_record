package com.springapp.mvc.business.domain.animal;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.springapp.mvc.business.domain.animal.base.BaseRecord;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = {"additionRecords"}, callSuper = true)
@ToString(exclude = {"additionRecords"})
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = AnimalRecordTypeEnum.type)
public abstract class AnimalRecord extends BaseRecord {
    private String name;

    private String kind;

    private String description;

    @Enumerated(EnumType.STRING)
    private GenderEnum genderType;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate birthday;

    @OneToMany(mappedBy = "animalRecord", fetch = FetchType.LAZY)
    private List<AdditionRecord> additionRecords;

    public AnimalRecord(long idx){
        super(idx);
    }

    public abstract String getAnimalRecordTypeName();
}
