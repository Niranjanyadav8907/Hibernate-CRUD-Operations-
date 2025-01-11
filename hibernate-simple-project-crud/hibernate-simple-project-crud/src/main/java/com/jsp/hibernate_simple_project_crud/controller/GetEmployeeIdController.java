package com.jsp.hibernate_simple_project_crud.controller;

import com.jsp.hibernate_simple_project_crud.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class GetEmployeeIdController {

	public static void main(String[] args) {
		
		EntityManager em = Persistence
				.createEntityManagerFactory("hibernate")
				.createEntityManager();
		
		
		Employee employee=em.find(Employee.class, 13);
		
		if(employee!=null) {
			System.out.println(employee);
		}else {
			System.out.println("given id is not found");
		}
		
	}
}
