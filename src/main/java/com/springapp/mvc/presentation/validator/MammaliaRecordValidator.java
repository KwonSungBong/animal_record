package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class MammaliaRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        MammaliaRecord mammaliaRecord = (MammaliaRecord) target;

        /*if (StringUtils.isEmpty(mammaliaRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return MammaliaRecord.class.isAssignableFrom(aClass);
    }
}
