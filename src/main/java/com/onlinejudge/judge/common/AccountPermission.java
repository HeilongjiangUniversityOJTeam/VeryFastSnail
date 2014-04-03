package com.onlinejudge.judge.common;
/**
 * @author		kitty
 * @description 	
 * @version		1.0
 * @modifydate 	2014年4月2日
 */
public class AccountPermission {

	/*
	 * 第0位为1表示拥有管理员权限
	 */
	public static boolean isAdmin(int permission){
		return ((permission>>0)&1) == 1;
	}
	
	/*
	 * 第1位为1表示拥有普通用户权限
	 */
	public static boolean isNormal(int permission){
		return ((permission>>1)&1) == 1;
	}
	
}
