package fsmflying.sys.domain;

import java.util.Date;

public class SysSequence {
	private String mKeyName;
	private String mNextValue;
	private Date mLastUpdateTime;
	public String getKeyName() {
		return mKeyName;
	}
	public void setKeyName(String keyName) {
		mKeyName = keyName;
	}
	public String getNextValue() {
		return mNextValue;
	}
	public void setNextValue(String nextValue) {
		mNextValue = nextValue;
	}
	public Date getLastUpdateTime() {
		return mLastUpdateTime;
	}
	public void setLastUpdateTime(Date lastUpdateTime) {
		mLastUpdateTime = lastUpdateTime;
	}
	
}
