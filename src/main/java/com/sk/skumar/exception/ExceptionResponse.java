package com.sk.skumar.exception;

import java.time.LocalTime;

public class ExceptionResponse {
	private LocalTime timestamp;
	private String message;
	private String details;

	public ExceptionResponse(LocalTime timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public LocalTime getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

}
