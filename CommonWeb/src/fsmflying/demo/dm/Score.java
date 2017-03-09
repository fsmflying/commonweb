package fsmflying.demo.dm;

public class Score {
//	private int id;
	private int studentId;
	private int examinationId;
	private int score;
	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Score(int studentId, int examinationId, int score) {
		super();
		this.studentId = studentId;
		this.examinationId = examinationId;
		this.score = score;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getExaminationId() {
		return examinationId;
	}
	public void setExaminationId(int examinationId) {
		this.examinationId = examinationId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
