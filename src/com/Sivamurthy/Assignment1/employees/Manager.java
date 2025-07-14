package com.Sivamurthy.Assignment1.employees;

public class Manager extends Employee{
	
    private String department;

    public Manager(String name, String id, double salary, String department) {
        super(name, id, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}