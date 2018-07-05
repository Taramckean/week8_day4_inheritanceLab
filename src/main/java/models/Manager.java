package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "managers")
public class Manager extends Employee {
	private int budget;
	private Department department;
	private List<Administrator> AdminEmployees;

	public Manager(){

	}

	public Manager(String name, int NInumber, int salary, int budget) {
		super(name, NInumber, salary);
		this.budget = budget;
		this.AdminEmployees = new ArrayList<Administrator>();
	}


	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	@OneToOne
			(mappedBy = "manager", fetch = FetchType.LAZY)
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@OneToMany(mappedBy="adminManager", fetch = FetchType.LAZY)
	public List<Administrator> getAdminEmployees() {
		return AdminEmployees;
	}

	public void setAdminEmployees(List<Administrator> AdminEmployees) {
		this.AdminEmployees = AdminEmployees;
	}
}
