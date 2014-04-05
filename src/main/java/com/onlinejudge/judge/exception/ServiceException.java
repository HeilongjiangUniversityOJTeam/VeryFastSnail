package com.onlinejudge.judge.exception;
/**
 * @author		kitty
 * @description 	
 * @version		1.0
 * @modifydate 	2014年4月4日
 */
public class ServiceException extends RuntimeException{

	private static final long serialVersionUID = 2481325682376924466L;

	private String info;

	public ServiceException(String info){
		this.info = info;
	}
	public String getInfo() {
		return info;
	}

}
