package org.jxls.reader.sample;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private Employee chief = new Employee();
	private List<Employee> staff = new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getChief() {
		return chief;
	}

	public void setChief(Employee chief) {
		this.chief = chief;
	}

	public List<Employee> getStaff() {
		return staff;
	}

	public void setStaff(List<Employee> staff) {
		this.staff = staff;
	}
	
	
	
}
