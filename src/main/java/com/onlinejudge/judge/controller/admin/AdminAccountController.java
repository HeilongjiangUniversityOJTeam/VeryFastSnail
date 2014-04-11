package com.onlinejudge.judge.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author		kitty
 * @description 	
 * @version		1.0
 * @modifydate 	2014年4月11日
 */

@Controller
@RequestMapping("/admin/account")
public class AdminAccountController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String adminAccount(Model model){
		return "admin/account/account_list";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String addAccountForm(Model model){
		return "admin/account/account_add";
	}
	
}
