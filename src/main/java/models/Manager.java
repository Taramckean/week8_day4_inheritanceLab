package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {
	private int budget;
	private String department;
	private List<Employee> employees;

	public Manager(){

	}

	public Manager(String name, int NInumber, int salary, int budget, String department) {
		super(name, NInumber, salary);
		this.budget = budget;
		this.department = department;
		this.employees = new ArrayList<Employee>();
	}


	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
