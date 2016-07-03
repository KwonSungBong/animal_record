package com.springapp.mvc.business.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CommonException extends RuntimeException {
    private int businessCode;
    private String referenceURL = "";

    public CommonException(int code) {
        this.businessCode = code;
    }

    public CommonException(int code, String referenceURL) {
        this.businessCode = code;
        this.referenceURL = referenceURL;
    }
}
