package com.cn.test1;

public class Secretary extends DeptEmployee {
	double overtimeHours;

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	@Override
	public double computeSalary() {
		// TODO Auto-generated method stub
		return 12*overtimeHours;
	}
}
