package fsmflying.demo.dm;

import java.util.Date;

public class Student {
	public int id;
	public String name;
	public int sex;
	public Date birthDate;
	public Student() {
		super();
	}
	public Student(String name, int sex, Date birthDate) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthDate = birthDate;
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
}
