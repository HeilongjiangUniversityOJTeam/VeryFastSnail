package com.onlinejudge.judge.dao;

import java.util.List;

import com.onlinejudge.judge.domain.Contest;

public interface ContestDAO {

	public void addContest(Contest contest);

	public void deleteContestById(Long id);

	public void updateContest(Contest contest);

	public Contest getContestById(Long id);

	public int countContest();
	
	public List<Contest> getContestList();

	public List<Contest> getContestListBetweenId(Long startId, Long endId);
	
	
}