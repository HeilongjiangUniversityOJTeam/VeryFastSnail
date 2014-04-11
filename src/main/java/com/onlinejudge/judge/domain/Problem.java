package com.onlinejudge.judge.domain;

public class Problem {

	private Long contestId;
	private Long problemId;
	private String title;
	private String description;
	private String inputDescription;
	private String outputDescription;
	private String inputSample;
	private String outputSample;

	public Long getContestId() {
		return contestId;
	}

	public void setContestId(Long contestId) {
		this.contestId = contestId;
	}

	public Long getProblemId() {
		return problemId;
	}

	public void setProblemId(Long problemId) {
		this.problemId = problemId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInputDescription() {
		return inputDescription;
	}

	public void setInputDescription(String inputDescription) {
		this.inputDescription = inputDescription;
	}

	public String getOutputDescription() {
		return outputDescription;
	}

	public void setOutputDescription(String outputDescription) {
		this.outputDescription = outputDescription;
	}

	public String getInputSample() {
		return inputSample;
	}

	public void setInputSample(String inputSample) {
		this.inputSample = inputSample;
	}

	public String getOutputSample() {
		return outputSample;
	}

	public void setOutputSample(String outputSample) {
		this.outputSample = outputSample;
	}

}
