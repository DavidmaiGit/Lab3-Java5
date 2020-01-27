package poly.bean;

public class Student {
	private String name;
	private double mark;
	private String major;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name, double mark, String major) {
		this.name = name;
		this.mark = mark;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMark() {
		return mark;
	}
	public void setMark(double mark) {
		this.mark = mark;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
