package com.jsp.hibernate_simple_project_crud.controller;

import java.util.List;

import com.jsp.hibernate_simple_project_crud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DisplayAllEmployeeController {

	public static void main(String[] args) {
		
		EntityManager em=Persistence
				.createEntityManagerFactory("hibernate")
				.createEntityManager();
		
		Query query=em.createQuery("Select a from Employee a");
		
		List<Employee> employees=query.getResultList();
		
		employees.forEach(a->System.out.println(a));
	}
}
