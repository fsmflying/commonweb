package fsmflying.demo.dm;

public class Examination {
	private int id;
	private int courseId;
	private String memo;
	public Examination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Examination(int id, int courseId, String memo) {
		super();
		this.id = id;
		this.courseId = courseId;
		this.memo = memo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
}
