package fsmflying.commonweb;

import java.util.HashMap;
import java.util.Map;

public class JsonHttpResult {
	private int result = 1;
	private Map<String,Object> data;
	private String message;
	
	
	public JsonHttpResult() {
		super();
		this.data = new HashMap<String,Object>();
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}


