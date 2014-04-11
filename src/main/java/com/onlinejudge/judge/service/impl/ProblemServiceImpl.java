package com.onlinejudge.judge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinejudge.judge.dao.ProblemDAO;
import com.onlinejudge.judge.domain.Problem;
import com.onlinejudge.judge.service.ProblemService;

/**
 * @author		kitty
 * @description 	
 * @version		1.0
 * @modifydate 	2014年4月9日
 */
@Service
public class ProblemServiceImpl implements ProblemService{

	@Autowired
	private ProblemDAO problemDAO;
	
	@Override
	public List<Problem> getProblemListByContestId(Long contestId) {
		return problemDAO.getProblemListByContestId(contestId);
	}

	@Override
	public Problem getProblemByContestIdAndProblemId(Long contestId, Long problemId) {
		return problemDAO.getProblemByContestIdAndProblemId(contestId, problemId);
	}

	@Override
	public void deleteProblemByContestIdAndProblemId(Long contestId,
			Long problemId) {
		problemDAO.deleteProblemByContestIdAndProblemId(contestId, problemId);
		
	}

	@Override
	public void batchDeleteProblemByContestIdAndProblemIds(Long contestId,
			List<Long> problemIds) {
		for(Long problemId: problemIds){
			problemDAO.deleteProblemByContestIdAndProblemId(contestId, problemId);
		}
	}
	
}
