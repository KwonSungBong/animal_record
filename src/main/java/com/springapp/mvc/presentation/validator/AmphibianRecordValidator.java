package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.AmphibianRecord;
import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class AmphibianRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        AmphibianRecord amphibianRecord = (AmphibianRecord) target;

        /*if (StringUtils.isEmpty(amphibianRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return AmphibianRecord.class.isAssignableFrom(aClass);
    }
}
