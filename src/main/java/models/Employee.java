package models;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name ="employees")
public abstract class Employee {
	private int id;
	private String name;
	private int NInumber;
	private int salary;

	public Employee(){

	}

	public Employee(String name, int NInumber, int salary) {
		this.name = name;
		this.NInumber = NInumber;
		this.salary = salary;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="id")
	public int getId() {
		return id;
	}
	@Column(name ="name")
	public String getName() {
		return name;
	}

	@Column(name ="NInumber")
	public int getNInumber() {
		return NInumber;
	}
	@Column(name ="salary")
	public int getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNInumber(int NInumber) {
		this.NInumber = NInumber;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}
