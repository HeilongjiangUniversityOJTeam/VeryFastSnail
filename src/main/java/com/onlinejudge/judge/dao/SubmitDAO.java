package com.onlinejudge.judge.dao;

import com.onlinejudge.judge.domain.Submit;

public interface SubmitDAO {

	public Submit getSubmitById(Long id);

	public void addSubmit(Submit submit);

	public void deleteSubmitById(Long id);

	public void updateSubmit(Submit submit);

}
