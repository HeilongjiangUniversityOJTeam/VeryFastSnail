package com.onlinejudge.judge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/problem")
public class ProblemController {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(Model model){
		return "/problem/problem";
	}
}
