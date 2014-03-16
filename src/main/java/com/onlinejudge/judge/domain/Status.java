package com.onlinejudge.judge.domain;

public class Status {

	private Long studentId;
	private Long problemId;
	private Long contestId;
	private Integer total;
	private Integer ac;
	private Integer wa;
	private Integer tle;
	private Integer re;
	private Integer mle;
	private Integer systemError;

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

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getAc() {
		return ac;
	}

	public void setAc(Integer ac) {
		this.ac = ac;
	}

	public Integer getWa() {
		return wa;
	}

	public void setWa(Integer wa) {
		this.wa = wa;
	}

	public Integer getTle() {
		return tle;
	}

	public void setTle(Integer tle) {
		this.tle = tle;
	}

	public Integer getRe() {
		return re;
	}

	public void setRe(Integer re) {
		this.re = re;
	}

	public Integer getMle() {
		return mle;
	}

	public void setMle(Integer mle) {
		this.mle = mle;
	}

	public Integer getSystemError() {
		return systemError;
	}

	public void setSystemError(Integer systemError) {
		this.systemError = systemError;
	}

}
