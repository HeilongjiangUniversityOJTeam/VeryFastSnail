package com.onlinejudge.judge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.onlinejudge.judge.domain.Contest;
import com.onlinejudge.judge.domain.Problem;
import com.onlinejudge.judge.service.ContestService;
import com.onlinejudge.judge.service.ProblemService;

@Controller
@RequestMapping("/contest")
public class ContestController {

	@Autowired
	private ContestService contestService;

	@Autowired
	private ProblemService problemService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String contestHome(Model model) {
		List<Contest>contestList = contestService.getContestList();
		model.addAttribute("contestList", contestList);
		return "/contest/problemList";
	}

	@RequestMapping(value = "/{contestId}", method = RequestMethod.GET)
	public String contestView(Model model, @PathVariable("contestId")Long contestId){
		List<Problem>problemList = problemService.getProblemListByContestId(contestId);
		model.addAttribute("problemList", problemList);
		return "/contest/contest";
	}
	
	@RequestMapping(value = "/{contestId}/{problemId}", method = RequestMethod.GET)
	public String contestProblemView(Model model, @PathVariable("contestId")Long contestId, @PathVariable("problemId")Long problemId){
		Problem problem = problemService.getProblemByContestIdAndProblemId(contestId,problemId);
		model.addAttribute("problem", problem);
		return "/contest/problem";
	}
}
