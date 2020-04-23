package com.sk.skumar.version.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.skumar.version.model.Name;
import com.sk.skumar.version.model.PersonV1;
import com.sk.skumar.version.model.PersonV2;

@RestController
public class PersonVersioningController {

	@GetMapping("/v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Sanjeet Kumar");
	}

	@GetMapping("/v2/person")
	public PersonV2 personV2() {
		return new PersonV2(new Name("Sanjeet", "Kumar"));
	}
	
	@GetMapping(value = "/person/param", params= "version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Sanjeet Kumar");
	}

	@GetMapping(value = "/person/param", params= "version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Sanjeet", "Kumar"));
	}
	
	@GetMapping(value = "/person/header", headers= "X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Sanjeet Kumar");
	}

	@GetMapping(value = "/person/header", headers= "X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Sanjeet", "Kumar"));
	}
}
