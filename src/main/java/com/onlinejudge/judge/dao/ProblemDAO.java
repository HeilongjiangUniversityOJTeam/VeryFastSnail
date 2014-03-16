package com.onlinejudge.judge.dao;

import java.util.List;

import com.onlinejudge.judge.domain.Problem;

public interface ProblemDAO {

	public Problem getProblemByContestIdAndProblemId(Long contestId,
			Long problemId);

	public List<Problem> findProblemListByContestId(Long contestId);

	public void addProblem(Problem problem);

	public void deleteProblemByContestIdAndProblemId(Long contestId,
			Long problemId);

	public void updateProblem(Problem problem);
}
