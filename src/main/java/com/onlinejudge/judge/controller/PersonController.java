package com.onlinejudge.judge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author kitty
 * @description 普通用户控制器，用户登录，登出，注册
 * @version 1.0
 * @modifydate 2014年3月14日
 */

@Controller("/person")
public class PersonController {

	/**
	 * @description 用户登录
	 * 
	 * @param String username
	 * 
	 * @param String password
	 * 
	 */
	@RequestMapping("/login")
	public String login(Model model, @RequestParam("username") String username,
			@RequestParam("password") String password) {

		//检查是否已经登陆
		
		
		return "home";
	}
}
