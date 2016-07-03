package com.springapp.mvc.component.aop;

import com.springapp.mvc.business.domain.animal.AdditionRecord;
import com.springapp.mvc.business.domain.animal.base.BaseRecord;
import org.apache.commons.lang3.math.NumberUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.time.LocalDate;

@Aspect
@Component
public class BaseRecordMethodInitialization {
    @Before("execution(* com.springapp.mvc.presentation.controller.HomeController.home(..))")
    public void test(JoinPoint joinPoint){
//        ModelMap model = (ModelMap)joinPoint.getArgs()[0];
//        model.addAttribute("test","test");
    }

    @Before("execution(* com.springapp.mvc.presentation.controller.rest.ArchiveController.postBaseRecords(..))")
    public void postAnimalRecords(JoinPoint joinPoint){
        Object firstParameterObject = joinPoint.getArgs()[0];
        if(firstParameterObject instanceof BaseRecord){
            BaseRecord baseRecord = (BaseRecord)firstParameterObject;
            baseRecord.setRegDate(LocalDate.now());
            baseRecord.setModDate(LocalDate.now());
        }
    }

    @Before("execution(* com.springapp.mvc.presentation.controller.rest.ArchiveController.putBaseRecords(..))")
    public void putAnimalRecords(JoinPoint joinPoint){
        Object firstParameterObject = joinPoint.getArgs()[0];
        if(firstParameterObject instanceof BaseRecord){
            BaseRecord baseRecord = (BaseRecord)firstParameterObject;
            baseRecord.setIdx(NumberUtils.INTEGER_ZERO);
            baseRecord.setModDate(LocalDate.now());
        }
    }
}
