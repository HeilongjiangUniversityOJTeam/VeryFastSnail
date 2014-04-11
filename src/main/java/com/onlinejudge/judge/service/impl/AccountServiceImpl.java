package com.onlinejudge.judge.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinejudge.judge.common.AccountPermission;
import com.onlinejudge.judge.dao.AccountDAO;
import com.onlinejudge.judge.domain.Account;
import com.onlinejudge.judge.exception.ServiceException;
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
	public List<String> getPermissionListByAccount(Account account) {
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

	@Override
	public void registerAccount(Account account) throws ServiceException{
		if(account.getUsername() != null && !account.getUsername().equals("") && account.getPassword() != null && !account.getPassword().equals("")){
			accountDAO.addAccount(account);
		}
		else{
			throw new ServiceException("用户名，密码，邮箱不能为空");
		}
	}

	@Override
	public List<Account> getAccountList() {
		return accountDAO.getAccountList();
	}

	@Override
	public void deleteAccountById(Long id) {
		accountDAO.deleteAccountById(id);
	}

	@Override
	public void batchDeleteAccountByIdList(List<Long> ids) {
		for(Long id: ids){
			accountDAO.deleteAccountById(id);
		}
	}

}
