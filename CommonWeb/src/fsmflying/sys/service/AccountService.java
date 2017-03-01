package fsmflying.sys.service;

import fsmflying.sys.domain.LoginResult;

public interface AccountService {
	public LoginResult login(String username,String password);
	public LoginResult logout(String username);
}
