package com.onlinejudge.judge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author		kitty
 * @description 	
 * @version		1.0
 * @modifydate 	2014年4月10日
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String adminHome(Model model) {
		return "admin/home";
	}
	
	@RequestMapping(value = "/account", method = RequestMethod.GET)
	public String adminAccount(Model model){
		return "admin/account";
	}
	
	@RequestMapping(value = "/contest", method = RequestMethod.GET)
	public String adminContest(Model model){
		return "admin/contest";
	}
	
	@RequestMapping(value = "/problem", method = RequestMethod.GET)
	public String adminProblem(Model model){
		return "admin/problem";
	}
}
