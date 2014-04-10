package com.onlinejudge.judge.dao;

import java.util.List;

import com.onlinejudge.judge.domain.Account;

public interface AccountDAO {

	public Account getAccountById(Long id);

	public Account getAccountByUsername(String username);

	public void addAccount(Account account);

	public void deleteAccountById(Long id);

	public void updateAccount(Account account);
	
	public List<Account>getAccountList();

}
