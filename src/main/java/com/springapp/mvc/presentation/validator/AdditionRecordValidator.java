package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.domain.animal.ReptiliaRecord;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

@Component
public class AdditionRecordValidator extends AbstractValidator {
    @Override
    protected void validateExec(Object target, Errors errors) {
        AdditionRecord additionRecord = (AdditionRecord) target;

        /*if (StringUtils.isEmpty(additionRecord.getDescription())) {
            throw new CommonException(10000);
        }*/
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return AdditionRecord.class.isAssignableFrom(aClass);
    }
}
