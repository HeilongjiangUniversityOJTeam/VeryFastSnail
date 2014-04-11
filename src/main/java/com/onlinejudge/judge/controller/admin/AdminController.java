package com.onlinejudge.judge.controller.admin;

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
}
