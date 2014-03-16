package com.onlinejudge.judge.dao;

import com.onlinejudge.judge.domain.Status;

public interface StatusDAO {

	public Status getStatusByPersonIdAndProblemIdAndContestId(Long personId,
			Long problemId, Long contestId);

	public void addStatus(Status status);

	public void deleteStatusByPersonIdAndProblemIdAndContestId(Long personId,
			Long problemId, Long contestId);
	
	public void updataStatus(Status status);
	
}
