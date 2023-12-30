package com.social.media.application.socialMediaApp.exception;

import java.time.LocalDateTime;

public class ErrorDetails {

	private LocalDateTime localDate;
	private String message ;
	private String details;

	public ErrorDetails(LocalDateTime localDate, String message, String details) {
		super();
		this.localDate = localDate;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getLocalDate() {
		return localDate;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}	
}
