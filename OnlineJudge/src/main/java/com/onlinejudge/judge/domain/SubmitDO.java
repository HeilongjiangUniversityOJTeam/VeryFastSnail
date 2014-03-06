package com.onlinejudge.judge.domain;

import java.sql.Date;

public class SubmitDO {

	private Long id;
	private Long studentId;
	private Long problemId;
	private Long contestId;
	private Integer status;
	private Date submitTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public Long getProblemId() {
		return problemId;
	}

	public void setProblemId(Long problemId) {
		this.problemId = problemId;
	}

	public Long getContestId() {
		return contestId;
	}

	public void setContestId(Long contestId) {
		this.contestId = contestId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(Date submitTime) {
		this.submitTime = submitTime;
	}

}
