package models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "administrators")
public class Administrator extends Employee {
	private Manager adminManager;

	public Administrator(){

	}

	public Administrator(String name, int NInumber, int salary, Manager adminManager) {
		super(name, NInumber, salary);
		this.adminManager = adminManager;
	}

	@ManyToOne
	@JoinColumn(name ="manager_id", nullable = false)
	public Manager getAdminManager() {
		return adminManager;
	}

	public void setAdminManager(Manager adminManager) {
		this.adminManager = adminManager;
	}
}
