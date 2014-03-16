package com.onlinejudge.judge.domain;

public class ProblemFile {

	private Long id;
	private Long problemId;
	private Long contestId;
	private Long inputFileId;
	private Long outputFileId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getInputFileId() {
		return inputFileId;
	}

	public void setInputFileId(Long inputFileId) {
		this.inputFileId = inputFileId;
	}

	public Long getOutputFileId() {
		return outputFileId;
	}

	public void setOutputFileId(Long outputFileId) {
		this.outputFileId = outputFileId;
	}

}
