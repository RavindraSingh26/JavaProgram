package com.jan2021;

import java.io.Serializable;

public class StudentBean implements Serializable{

	private String name;
	private String laddress;
	private int sal;
	private String grade;
	private int score;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public StudentBean(String name, String laddress, int sal, String grade, int score) {
		
		this.name = name;
		this.laddress = laddress;
		this.sal = sal;
		this.grade = grade;
		this.score = score;
	}
	
	
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the laddress
	 */
	public String getLaddress() {
		return laddress;
	}
	/**
	 * @param laddress the laddress to set
	 */
	public void setLaddress(String laddress) {
		this.laddress = laddress;
	}
	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", laddress=" + laddress + ", sal=" + sal + ", grade=" + grade + ", score="
				+ score + "]";
	}
	
	
	
}
