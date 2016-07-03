package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.FishRecord;
import com.springapp.mvc.business.domain.animal.MammaliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class FishRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        FishRecord fishRecord = (FishRecord) target;

        /*if (StringUtils.isEmpty(fishRecord.getName())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return FishRecord.class.isAssignableFrom(aClass);
    }
}
