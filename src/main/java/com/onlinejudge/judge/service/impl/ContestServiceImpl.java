package com.onlinejudge.judge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinejudge.judge.dao.ContestDAO;
import com.onlinejudge.judge.domain.Contest;
import com.onlinejudge.judge.domain.Problem;
import com.onlinejudge.judge.service.ContestService;

@Service
public class ContestServiceImpl implements ContestService {

	@Autowired
	private ContestDAO contestDAO;

	@Override
	public int count() {
		return contestDAO.countContest();
	}

	@Override
	public Contest getContestById(Long id) {
		return contestDAO.getContestById(id);
	}

	@Override
	public List<Contest> getContestList() {
		return contestDAO.getContestList();
	}

	@Override
	public List<Contest> getContestListBetweenId(Long startId, Long endId) {
		return contestDAO.getContestListBetweenId(startId, endId);
	}


}
