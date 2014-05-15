package com.autowire;

public class AutoWireBean {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "AutoWireBean [message=" + message + "]";
	}

}
