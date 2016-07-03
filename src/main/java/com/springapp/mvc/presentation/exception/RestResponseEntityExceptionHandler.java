package com.springapp.mvc.presentation.exception;

import com.springapp.mvc.business.exception.CommonException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
    private static ErrorMessageMap messageMap = new ErrorMessageMap();

    @ExceptionHandler(value = {Exception.class})
    protected Object handleCommonRuntime(Exception ex, WebRequest request) {
        ex.printStackTrace();
        if (request.getHeader("X-Requested-With") == null) {
            ModelAndView error_page = new ModelAndView("error_page");
            error_page.addObject("code", 1);
            error_page.addObject("message", messageMap.getMessage(1));
            return error_page;
        } else {
            return createResponseEntity(ex, request);
        }
    }

    public ResponseEntity createResponseEntity(Exception ex, WebRequest request) {
        ResponseEntity<Object> responseEntity = null;

        responseEntity = handleExceptionInternal(ex, createResponseEntity(new CommonException(1), HttpStatus.INTERNAL_SERVER_ERROR), new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);

        return responseEntity;
    }

    private static RestErrorResponseEntity createResponseEntity(CommonException exception, HttpStatus httpStatus) {
        RestErrorResponseEntity responseEntity = new RestErrorResponseEntity();

        responseEntity.setCode(String.valueOf(exception.getBusinessCode()));
        responseEntity.setMessage(messageMap.getMessage(exception.getBusinessCode()));
        responseEntity.setStatus(httpStatus.toString());
        responseEntity.setMoreInfo(exception.getReferenceURL());

        return responseEntity;
    }
}
