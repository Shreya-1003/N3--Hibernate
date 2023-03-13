package org.tnsif.tableperclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name="Employee1")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)


public class Employee1 implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//data members
	@Id
	private Integer id;
	private String name;
	private Float salary;

	//getter and setter
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}


