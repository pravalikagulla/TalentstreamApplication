
//
//public class APIResponse<T> {
//	
//	private String message;
//	private T data;
//	private int Code;
//	public APIResponse(String message, T data, int code) {
//		super();
//		this.message = message;
//		this.data = data;
//		Code = code;
//	}
//	public String getMessage() {
//		return message;
//	}
//	public void setMessage(String message) {
//		this.message = message;
//	}
//	public T getData() {
//		return data;
//	}
//	public void setData(T data) {
//		this.data = data;
//	}
//	public int getCode() {
//		return Code;
//	}
//	public void setCode(int code) {
//		Code = code;
//	}
//	
//	
//	
//
//}
package com.example.demo.entity;

import java.util.Map;

public class APIResponse<T> {
    
    private String message;
    private T data;
    private Map<String, String> errors; 
    private int code;
    
    public APIResponse(String message, T data, int code) {
        this.message = message;
        this.data = data;
        this.code = code;
    }
    
 
    
    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Map<String, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, String> errors) {
        this.errors = errors;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}

