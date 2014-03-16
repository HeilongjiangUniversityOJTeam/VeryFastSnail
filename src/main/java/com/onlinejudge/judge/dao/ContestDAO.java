package com.onlinejudge.judge.dao;

import com.onlinejudge.judge.domain.Contest;

public interface ContestDAO {

	public void addContest(Contest contest);

	public void deleteContestById(Long id);

	public void updateContest(Contest contest);

	public Contest getContestById(Long id);

	public int countContest();
}