package com.onlinejudge.judge.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.onlinejudge.judge.service.AccountService;

/**
 * @author kitty
 * @description 普通用户控制器，用户登录，登出，注册
 * @version 1.0
 * @modifydate 2014年3月14日
 */

@Controller("/account")
public class AccountController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model) {

		return "account/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginRequest(Model model, @RequestParam("username") String username,
			@RequestParam("password") String password) {
		
		try{
			UsernamePasswordToken token = new UsernamePasswordToken(username, password);
	        Subject subject = SecurityUtils.getSubject();  
	        subject.login(token);
		}catch(IncorrectCredentialsException | UnknownAccountException e){
			model.addAttribute("message",e.getMessage());
			return "account/loginFailed";
		}
		return "account/loginSuccess";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model){
		SecurityUtils.getSubject().logout();
		return "logoutSuccess";
	}
	
}
