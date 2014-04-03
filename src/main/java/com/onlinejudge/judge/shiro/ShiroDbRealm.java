package com.onlinejudge.judge.shiro;

import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.onlinejudge.judge.domain.Account;
import com.onlinejudge.judge.service.AccountService;

/**
 * @author kitty
 * @description
 * @version 1.0
 * @modifydate 2014年3月31日
 */

public class ShiroDbRealm extends AuthorizingRealm {

	@Autowired
	private AccountService accountService;
	
	public void setAccountService(AccountService accountService){
		this.accountService = accountService;
	}
	/**
	 * 授权查询回调函数, 进行鉴权但缓存中无用户的授权信息时调用.
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String)principals.fromRealm(getName()).iterator().next();
		Account account = accountService.getAccountByUsername(username);
		if(account != null){
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			List<String>permissions = accountService.getPermissionsByAccount(account);
			info.addStringPermissions(permissions);
		}
		return null;
	}

	/**
	 * 认证回调函数,登录时调用.
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		Account account = accountService.getAccountByUsername(token.getUsername());
		if(account != null){
			return new SimpleAuthenticationInfo(account.getUsername(),account.getPassword(),getName());
		}
		return null;
	}
	
}
