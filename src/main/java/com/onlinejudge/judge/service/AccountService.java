package com.onlinejudge.judge.service;

import java.util.List;

import com.onlinejudge.judge.domain.Account;

/**
 * @author kitty
 * @description
 * @version 1.0
 * @modifydate 2014年3月14日
 */
public interface AccountService {

	public Account getAccountByUsername(String username);

	public List<String> getPermissionsByAccount(Account account);
}
