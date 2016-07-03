package com.springapp.mvc.presentation.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestErrorResponseEntity {
    private String status;
    private String message;
    private String code;
    private String moreInfo;
}