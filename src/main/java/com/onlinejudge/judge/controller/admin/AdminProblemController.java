package com.onlinejudge.judge.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.onlinejudge.judge.domain.Problem;
import com.onlinejudge.judge.service.ProblemService;

/**
 * @author		kitty
 * @description 	
 * @version		1.0
 * @modifydate 	2014年4月11日
 */
@Controller
@RequestMapping("/admin/problem")
public class AdminProblemController {

	@Autowired
	private ProblemService problemService;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String adminProblem(Model model){
		return "admin/problem/problem_list";
	}
	
	@RequestMapping(value = "/update/{contestId}/{problemId}", method = RequestMethod.GET)
	public String updateProblemForm(Model model, @PathVariable("contestId")Long contestId, @PathVariable("problemId")Long problemId){
		Problem problem = problemService.getProblemByContestIdAndProblemId(contestId, problemId);
		model.addAttribute("problem", problem);
		return "admin/problem/update";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateProblem(Model model,
			@RequestParam("contestId")Long contestId,
			@RequestParam("problemId")Long problemId,
			@RequestParam("title")String title,
			@RequestParam("description")String description,
			@RequestParam("inputDescription")String inputDescription,
			@RequestParam("outputDescription")String outputDescription,
			@RequestParam("inputSample")String inputSample,
			@RequestParam("outputSample")String outputSample
			){
		Problem problem = problemService.getProblemByContestIdAndProblemId(contestId, problemId);
		problem.setTitle(title);
		problem.setDescription(description);
		problem.setInputDescription(inputDescription);
		problem.setOutputDescription(outputDescription);
		problem.setInputSample(inputSample);
		problem.setOutputSample(outputSample);
		problemService.updateProblem(problem);
		return "redirect:/admin/problem";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String updateProblem(Model model,
			@RequestParam("contestId")Long contestId,
			@RequestParam("title")String title,
			@RequestParam("description")String description,
			@RequestParam("inputDescription")String inputDescription,
			@RequestParam("outputDescription")String outputDescription,
			@RequestParam("inputSample")String inputSample,
			@RequestParam("outputSample")String outputSample
			){
		Problem problem = new Problem();
		problem.setContestId(contestId);
		problem.setTitle(title);
		problem.setDescription(description);
		problem.setInputDescription(inputDescription);
		problem.setOutputDescription(outputDescription);
		problem.setInputSample(inputSample);
		problem.setOutputSample(outputSample);
		problemService.addProblem(problem);
		return "redirect:/admin/problem";
	}
}
