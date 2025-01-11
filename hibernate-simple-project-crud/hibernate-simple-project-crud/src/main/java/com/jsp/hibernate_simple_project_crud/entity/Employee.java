package com.jsp.hibernate_simple_project_crud.entity;


import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 17527517212868L;
	
	@Id
	private int id;
	private String name;
	private String email;
	@Column(name = "dateofjoining")
	private LocalDate doj;
	private String city;
	
}
