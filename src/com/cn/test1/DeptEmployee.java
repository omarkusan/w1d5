package com.cn.test1;

import java.util.Date;

public class DeptEmployee {
	private String name;
	private double salary;
	private Date hiredate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public double computeSalary(){
		return salary;
	}
}
