package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.ArachnidRecord;
import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class ArachnidRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        ArachnidRecord arachnidRecord = (ArachnidRecord) target;

        /*if (StringUtils.isEmpty(arachnidRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return ArachnidRecord.class.isAssignableFrom(aClass);
    }
}
