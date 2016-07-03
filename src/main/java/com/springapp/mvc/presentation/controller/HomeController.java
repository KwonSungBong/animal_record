package com.springapp.mvc.presentation.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springapp.mvc.business.domain.animal.*;
import com.springapp.mvc.component.util.BaseEnumUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public ModelAndView home() throws JsonProcessingException {
		ModelAndView mav = new ModelAndView("home");

		mav.addObject("animalRecordTypeEnum", AnimalRecordTypeEnum.values());
		mav.addObject("animalRecordTypeEnumJsonString", BaseEnumUtils.getEnumToJsonString(AnimalRecordTypeEnum.class));
		mav.addObject("genderEnumJsonString", BaseEnumUtils.getEnumToJsonString(GenderEnum.class));
		mav.addObject("additionRecordCategoryTypeEnumJsonString", BaseEnumUtils.getEnumToJsonString(AdditionRecordCategoryTypeEnum.class));
		mav.addObject("additionRecordStatusEnumJsonString", BaseEnumUtils.getEnumToJsonString(AdditionRecordStatusEnum.class));
		mav.addObject("additionRecordTypeEnumJsonString", BaseEnumUtils.getEnumToJsonString(AdditionRecordTypeEnum.class));

		return mav;
	}

	@RequestMapping(value = "/login_form", method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
}