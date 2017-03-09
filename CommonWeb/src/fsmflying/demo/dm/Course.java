package fsmflying.demo.dm;

import java.util.Date;

public class Course {
	private int id;
	private String name;
	private int subjectId;
	private int teacherId;
	private Date startDate;
	private String memo;

	public Course() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Course(String name, int subjectId, int teacherId, Date startDate,
			String memo) {
		super();
		this.name = name;
		this.subjectId = subjectId;
		this.teacherId = teacherId;
		this.startDate = startDate;
		this.memo = memo;
	}

}
