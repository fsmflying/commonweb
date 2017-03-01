package fsmflying.sys.domain;

public class LoginResult {
	private User user;
	private int result = 0;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private String message;

	public void success() {
		this.result = 1;
	}

	public void failure() {
		this.result = 0;
	}
}
