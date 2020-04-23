package com.sk.skumar;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SkumarApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkumarApplication.class, args);
	}

	@Bean
	public LocaleResolver localeResoler() {
		AcceptHeaderLocaleResolver localeResoler = new AcceptHeaderLocaleResolver();
		localeResoler.setDefaultLocale(Locale.US);
		return localeResoler;
	}
	
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		
		return messageSource;
	}
}
