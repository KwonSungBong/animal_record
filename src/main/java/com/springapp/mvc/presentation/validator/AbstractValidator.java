package com.springapp.mvc.presentation.validator;

import com.springapp.mvc.presentation.exception.ErrorMessageMap;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public abstract class AbstractValidator implements Validator {
    protected static ErrorMessageMap errorMessageMap = new ErrorMessageMap();

    protected abstract void validateExec(Object target, Errors errors);

    @Override
    public void validate(Object o, Errors errors) {
        validateExec(o, errors);
    }
}
