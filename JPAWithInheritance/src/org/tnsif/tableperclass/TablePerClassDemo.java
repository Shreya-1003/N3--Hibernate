package org.tnsif.tableperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Employee1 em1=new Employee1();
		em1.setId(131);
		em1.setName("shreya thorat");
		em1.setSalary(25000.50f);
		em.persist(em1);
		
		//second emp
		Employee1 em2=new Employee1();
		em2.setId(132);
		em2.setName("rutuja gite");
		em2.setSalary(45000.50f);
		em.persist(em2);
		
		//first Manager
		Manager1 m1=new Manager1();
		m1.setId(133);
		m1.setName("rasika w");
		m1.setSalary(42000.45f);
		m1.setDeptid(45);
		m1.setDeptname("Information Technology");
		em.persist(m1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}
}
