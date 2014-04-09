package com.onlinejudge.judge.service;

import java.util.List;

import com.onlinejudge.judge.domain.Problem;


public interface ProblemService {
	
	public List<Problem>getProblemListByContestId(Long contestId);
	public Problem getProblemByContestIdAndProblemId(Long contestId, Long problemId);
	
}
