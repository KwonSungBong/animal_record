package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.BirdRecord;
import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class BirdRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        BirdRecord birdRecord = (BirdRecord) target;

        /*if (StringUtils.isEmpty(birdRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return BirdRecord.class.isAssignableFrom(aClass);
    }
}
