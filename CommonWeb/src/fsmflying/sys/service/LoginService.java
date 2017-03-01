package fsmflying.sys.service;

public interface LoginService {
	public String existsUser(String username);
	public String login(String username,String password);
	public String logout(String username);
}
