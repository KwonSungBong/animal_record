package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.InsectRecord;
import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class InsectRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        InsectRecord insectRecord = (InsectRecord) target;

        /*if (StringUtils.isEmpty(insectRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return InsectRecord.class.isAssignableFrom(aClass);
    }
}
