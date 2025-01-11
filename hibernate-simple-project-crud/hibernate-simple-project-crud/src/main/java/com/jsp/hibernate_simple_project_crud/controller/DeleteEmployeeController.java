package com.jsp.hibernate_simple_project_crud.controller;

import com.jsp.hibernate_simple_project_crud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteEmployeeController {

	public static void main(String[] args) {
		EntityManager em=Persistence
				.createEntityManagerFactory("hibernate")
				.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Employee emp=em.find(Employee.class, 123);
		
		if(emp!=null) {
			et.begin();
			em.remove(emp);
			et.commit();
		}else {
			System.out.println("given id is not present");
		}
	}
}
