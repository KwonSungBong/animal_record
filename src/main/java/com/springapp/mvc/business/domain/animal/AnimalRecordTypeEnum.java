package com.springapp.mvc.business.domain.animal;

import com.springapp.mvc.business.domain.animal.base.BaseEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum AnimalRecordTypeEnum implements BaseEnum {
    MAMMALIA("포유류"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return MammaliaRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new MammaliaRecord(idx);
        }
    },
    AMPHIBIAN("양서류"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return AmphibianRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new AmphibianRecord(idx);
        }
    },
    BIRD("조류"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return BirdRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new BirdRecord(idx);
        }
    },
    INSECT("곤충류"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return InsectRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new InsectRecord(idx);
        }
    },
    ARACHNID("거미류"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return ArachnidRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new ArachnidRecord(idx);
        }
    },
    REPTILIA("파충류"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return ReptiliaRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new ReptiliaRecord(idx);
        }
    },
    FISH("어류"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return FishRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new FishRecord(idx);
        }
    },
    INVERTEBRATE("무척추동물"){
        @Override
        public Class getAnimalRecordTypeClass() {
            return InvertebrateRecord.class;
        }

        @Override
        public AnimalRecord getAnimalRecordTypeInstance(long idx) {
            return new InvertebrateRecord(idx);
        }
    };

    public static final String type = "animal_record_type";

    public static final String MAMMALIA_RECORD_TYPE = "mammalia";
    public static final String AMPHIBIAN_RECORD_TYPE = "amphibian";
    public static final String BIRD_RECORD_TYPE = "bird";
    public static final String INSECT_RECORD_TYPE = "insect";
    public static final String ARACHNID_RECORD_TYPE = "arachnid";
    public static final String REPTILIA_RECORD_TYPE = "reptilia";
    public static final String FISH_RECORD_TYPE = "fish";
    public static final String INVERTEBRATE_RECORD_TYPE = "invertebrate";

    private String name;

    public abstract Class getAnimalRecordTypeClass();
    public abstract AnimalRecord getAnimalRecordTypeInstance(long idx);
}