package com.wipro.inheritance;

public class TestEmployee {
public static void main(String[] args) {
	Employee obj = new Employee();
	obj.setName("Hema");
	obj.setAnnualSalary(60000);
	obj.setYearStartToWork(2021);
	obj.setInsuranceNo("262234");
	System.out.println("Employee Name-"+obj.getName()+"\nEmployee AnnualSalary-"+obj.getAnnualSalary()+"\nEmployee year started to work-"+obj.getYearStartToWork()+"\nEmployee Insurance number-"+obj.getInsuranceNo());
}
}
