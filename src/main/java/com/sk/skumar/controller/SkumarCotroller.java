package com.sk.skumar.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sk.skumar.model.HelloSKumar;

//Controller
@RestController
public class SkumarCotroller {

	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path = "/hello-sk")
	public String helloSK() {
		return "Hello Kumar Sanjeet";
	}

	@GetMapping(path = "/hello-sk-bean")
	public HelloSKumar helloSKumar() {
		return new HelloSKumar("Hello Kumar");
	}

	
	@GetMapping(path = "/hello-sk/path-variable/{name}")
	public HelloSKumar helloSkumarPathVariable(@PathVariable String name) {
		return new HelloSKumar(String.format("Hello, %s", name));
	}
	
	@GetMapping(path = "/hello-sk-i18n")
	public String helloSKlocale() {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}

}
