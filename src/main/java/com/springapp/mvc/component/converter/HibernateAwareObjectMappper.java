package com.springapp.mvc.component.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate5.Hibernate5Module;

/**
 * Created by ohjic-donghoon on 2016-04-18.
 */
public class HibernateAwareObjectMappper extends ObjectMapper {
    public HibernateAwareObjectMappper(){
        registerModule(new Hibernate5Module());
    }
}
