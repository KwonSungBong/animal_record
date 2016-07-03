package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.InvertebrateRecord;
import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class InvertebrateRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        InvertebrateRecord invertebrateRecord = (InvertebrateRecord) target;

        /*if (StringUtils.isEmpty(invertebrateRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return InvertebrateRecord.class.isAssignableFrom(aClass);
    }
}
