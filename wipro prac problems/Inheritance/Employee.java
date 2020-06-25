package com.wipro.inheritance;

class Employee extends Person {
double annualSalary;
int yearStartToWork;
String insuranceNo;
public double getAnnualSalary() {
	return annualSalary;
}
public void setAnnualSalary(double annualSalary) {
	this.annualSalary = annualSalary;
}
public int getYearStartToWork() {
	return yearStartToWork;
}
public void setYearStartToWork(int yearStartToWork) {
	this.yearStartToWork = yearStartToWork;
}
public String getInsuranceNo() {
	return insuranceNo;
}
public void setInsuranceNo(String insuranceNo) {
	this.insuranceNo = insuranceNo;
}

}