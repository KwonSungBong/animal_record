package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.ReptiliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class ReptiliaRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        ReptiliaRecord reptiliaRecord = (ReptiliaRecord) target;

        /*if (StringUtils.isEmpty(reptiliaRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return ReptiliaRecord.class.isAssignableFrom(aClass);
    }
}
