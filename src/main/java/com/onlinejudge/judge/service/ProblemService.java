package com.onlinejudge.judge.service;

import java.util.List;

import com.onlinejudge.judge.domain.Problem;


public interface ProblemService {
	
	public List<Problem>getProblemListByContestId(Long contestId);
	public Problem getProblemByContestIdAndProblemId(Long contestId, Long problemId);
	public void deleteProblemByContestIdAndProblemId(Long contestId, Long problemId);
	/* 日后优化 */
	public void batchDeleteProblemByContestIdAndProblemIds(Long contestId,List<Long> problemIds);
	public void addProblem(Problem problem);
	public void updateProblem(Problem problem);
}
