package com.demo;

public class StudentBean {
	private Integer stdId; 
	private String stdName;
	//private float mks_cc;
	
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentBean(Integer stdId, String stdName) {//Integer mks_cc
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		//this.mks_cc = mks_cc;

	}
	public Integer getStdId() {
		return stdId;
	}
	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
//	public float getmks_cc() {
//		return mks_cc;
	//}
	//public void setmks_cc(float mks_cc) {
		//this.mks_cc = mks_cc;

	//}

}
