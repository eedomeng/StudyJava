package com.mc.qrserver.http;

public enum HttpStatusCode {
	OK(200, "ok", "http/1.1 200 ok");
	
	private int code;
	private String message;
	private String start_line;
	
	private HttpStatusCode(int code, String message, String start_line) {
		this.code = code;
		this.message = message;
		this.start_line = start_line;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}
	
}
