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
@RequestMapping("/admin/contest")
public class AdminContestController {

	@RequestMapping(value = "/contest", method = RequestMethod.GET)
	public String adminContest(Model model){
		return "admin/contest";
	}
}
