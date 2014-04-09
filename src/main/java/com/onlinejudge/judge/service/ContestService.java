package com.onlinejudge.judge.service;

import java.util.List;

import com.onlinejudge.judge.domain.Contest;
import com.onlinejudge.judge.domain.Problem;

public interface ContestService {

	public int count();

	public Contest getContestById(Long id);

	public List<Contest> getContestList();

	List<Contest> getContestListBetweenId(Long startId, Long endId);
	
}
