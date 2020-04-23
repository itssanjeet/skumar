package com.sk.skumar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.sk.skumar.model.SomeBean;

@RestController
public class FilterSomeBeanController {

	@GetMapping("/filter-bean")
	public MappingJacksonValue filterOne() {
		SomeBean someBean = new SomeBean("Value1", "Value2", "Value3");

		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field1", "field2");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(someBean);
		mapping.setFilters(filters);

		return mapping;
	}

	@GetMapping("/filter-bean-list")
	public MappingJacksonValue listOfSomeBean() {

		List<SomeBean> asList = Arrays.asList(new SomeBean("Value1", "Value2", "Value3"), new SomeBean("Value1", "Value2", "Value3"));
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("field2", "field3");
		FilterProvider filters = new SimpleFilterProvider().addFilter("SomeBeanFilter", filter);

		MappingJacksonValue mapping = new MappingJacksonValue(asList);
		mapping.setFilters(filters);
		
		return mapping;
	}
}
