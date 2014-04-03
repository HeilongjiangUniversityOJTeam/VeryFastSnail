package com.onlinejudge.judge.domain;

public class AccountContest {

	private Long accountId;
	private Long contestId;
	private Integer permission;
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public Long getContestId() {
		return contestId;
	}
	public void setContestId(Long contestId) {
		this.contestId = contestId;
	}
	public Integer getPermission() {
		return permission;
	}
	public void setPermission(Integer permission) {
		this.permission = permission;
	}


}
