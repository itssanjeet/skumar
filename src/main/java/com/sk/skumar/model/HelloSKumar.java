package com.sk.skumar.model;

public class HelloSKumar {

	private String message;

	public HelloSKumar(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloSKumar [message=" + message + "]";
	}
}
