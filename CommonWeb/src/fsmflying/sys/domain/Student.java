package fsmflying.sys.domain;

public class Student {
	private int mId;
	private String mName;
	private int	mAge;
	
	public int getId() {
		return mId;
	}
	public void setId(int id) {
		mId = id;
	}
	public String getName() {
		return mName;
	}
	public void setName(String name) {
		mName = name;
	}
	public int getAge() {
		return mAge;
	}
	public void setAge(int age) {
		mAge = age;
	}
	@Override
	public String toString() {
		return "Student [mId=" + mId + ", mName=" + mName + ", mAge=" + mAge
				+ "]";
	}
	
	
}
