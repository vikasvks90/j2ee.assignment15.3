package assignment15.session3.bean;

import java.util.Date;

public class Student {  
	private int stud_id;  
	private String stud_name;
	private int stud_marks;
	private Date stud_join_date;
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_Name) {
		this.stud_name = stud_Name;
	}
	public int getStud_marks() {
		return stud_marks;
	}
	public void setStud_marks(int stud_marks) {
		this.stud_marks = stud_marks;
	}
	public Date getStud_join_date() {
		return stud_join_date;
	}
	public void setStud_join_date(Date stud_join_date) {
		this.stud_join_date = stud_join_date;
	}
   
}  