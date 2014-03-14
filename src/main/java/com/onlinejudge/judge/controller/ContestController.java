package com.onlinejudge.judge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlinejudge.judge.service.ContestService;

@Controller
@RequestMapping("/contest")
public class ContestController {

	@Autowired
	private ContestService contestService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Model model) {
		//NaiyinZhao test
		int count = contestService.count();
		model.addAttribute("count", count);
		return "/contest/contest";
	}

}
