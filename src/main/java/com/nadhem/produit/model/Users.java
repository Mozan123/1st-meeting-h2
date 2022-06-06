package com.nadhem.produit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;

private String name;

private String team;

private Integer salary;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public String getTeam() {
	return team;
}

public void setTeam(String team) {
	this.team = team;
}

public Integer getSalary() {
	return salary;
}

public void setSalary(Integer salary) {
	this.salary = salary;
}



}
