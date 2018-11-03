package com.euishoe.common.exception;

/**
 * 사용자 정의 RuntimeException
 * 
 * @author 전상일
 */
public class GGException extends RuntimeException {
	
	private static final String DEFAULT_CODE = "KMS-0001";
	private String code;

	public GGException() {
		this(DEFAULT_CODE, "Database Server Error!");				
	}
		
	public GGException(String message) {
		super(message);
	}

	public GGException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public GGException(String code, String message) {
		super(message);
		this.code = code;
	}
	
	public GGException(String code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
