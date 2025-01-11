package com.jsp.hibernate_simple_project_crud.controller;

import com.jsp.hibernate_simple_project_crud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateEmployeeController {

	public static void main(String[] args) {
	
		EntityManager em=Persistence
				.createEntityManagerFactory("hibernate")
				.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp=em.find(Employee.class, 123);
		
		if(emp!=null) {
			emp.setCity("Lucknow");
			et.begin();
			em.merge(emp);
			et.commit();
		}else {
			System.out.println("given id is not present");
		}
	}
	
}
