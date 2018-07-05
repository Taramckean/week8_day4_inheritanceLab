package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
	private int id;
	private String title;
	private Manager manager;

	public Department(){

	}

	public Department(String title, Manager manager) {
		this.title = title;
		this.manager = manager;
	}
}
