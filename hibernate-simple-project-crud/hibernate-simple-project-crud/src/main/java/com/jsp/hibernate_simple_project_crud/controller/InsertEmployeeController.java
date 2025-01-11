package com.jsp.hibernate_simple_project_crud.controller;

import java.time.LocalDate;

import com.jsp.hibernate_simple_project_crud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertEmployeeController {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Employee employee = new Employee(432, "Mazhar", "mazhar@gmail.com", LocalDate.parse("1997-09-09"), "Bangalore");
	
		et.begin();
		
		em.persist(employee);
		
		et.commit();
	
	}
}
