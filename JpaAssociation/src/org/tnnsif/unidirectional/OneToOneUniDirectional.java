package org.tnnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneUniDirectional {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//one employee
		Employee emp1 = new Employee();
		emp1.setEmpname("Shreya Thorat");
		
		//second
		Employee emp2 = new Employee();
		emp2.setEmpname("Arjun");
		
		//first address
		Address a1 = new Address();
		a1.setPincode(422101);
		a1.setCity("nashik");
		a1.setState("Maharashtra");
		
		//second address
			Address a2 = new Address();
			a2.setPincode(422103);
			a2.setCity("nashik");
			a2.setState("Maharashtra");
			
			emp2.setAddress(a1);
			emp1.setAddress(a2);
			
			em.persist(emp1);
			em.persist(emp2);
			
			em.getTransaction().commit();
			
			System.out.println("data addedd successfyullt");
			em.close();
			
			factory.close();
	}

}