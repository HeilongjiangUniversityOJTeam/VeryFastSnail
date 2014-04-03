package com.onlinejudge.judge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinejudge.judge.common.AccountPermission;
import com.onlinejudge.judge.dao.AccountDAO;
import com.onlinejudge.judge.domain.Account;
import com.onlinejudge.judge.service.AccountService;

/**
 * @author kitty
 * @description
 * @version 1.0
 * @modifydate 2014年4月1日
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;

	@Override
	public Account getAccountByUsername(String username) {
		return accountDAO.getAccountByUsername(username);
	}

	@Override
	public List<String> getPermissionsByAccount(Account account) {
		int permission = account.getPermission();
		List<String> permissions = permissionToStringList(permission);
		return permissions;
	}

	private List<String> permissionToStringList(int permission) {
		List<String> permissionStringList = new ArrayList<String>();
		if (AccountPermission.isAdmin(permission)) {
			permissionStringList.add("admin");
		}
		if (AccountPermission.isNormal(permission)) {
			permissionStringList.add("normal");
		}
		return permissionStringList;
	}

}
