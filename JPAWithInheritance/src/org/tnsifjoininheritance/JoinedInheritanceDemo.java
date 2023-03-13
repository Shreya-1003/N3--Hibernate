package org.tnsifjoininheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.tnsif.tableperclass.Employee1;
import org.tnsif.tableperclass.Manager1;

public class JoinedInheritanceDemo {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		
		em.getTransaction().begin();
		
		//first emp
		Student1 em1=new Student1();
		em1.setRollno(136);
		em1.setName("shreya thorat");
		em1.setPercentage(85.90f);
		em.persist(em1);
		
		//second emp
		Student1 em2=new Student1();
		em2.setRollno(134);
		em2.setName("rutuja gite");
		em2.setPercentage(81.5f);
		em.persist(em2);
		
		//first Manager
		CItizen c1=new CItizen();
		c1.setRollno(135);
		c1.setName("rasika w");
		c1.setPercentage(42000.45f);
		c1.setCitizenType("india");
		c1.setPasssportno(125678);
		em.persist(c1);
		em.getTransaction().commit();

		System.out.println("Data added successfully");
		em.close();

		factory.close();

		
	}

}
