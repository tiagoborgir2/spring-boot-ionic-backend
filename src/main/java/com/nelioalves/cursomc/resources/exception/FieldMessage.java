package com.nelioalves.cursomc.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fieldNname;
	private String message;
	
	public FieldMessage() {
	}

	public FieldMessage(String fieldNname, String message) {
		super();
		this.fieldNname = fieldNname;
		this.message = message;
	}

	public String getFieldNname() {
		return fieldNname;
	}

	public void setFieldNname(String fieldNname) {
		this.fieldNname = fieldNname;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
