package com.onlinejudge.judge.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinejudge.judge.dao.ContestDAO;
import com.onlinejudge.judge.service.ContestService;

@Service
public class ContestServiceImpl implements ContestService {

	@Autowired
	private ContestDAO contestDAO;

	@Override
	public int count() {
		return contestDAO.count();
	}

}
