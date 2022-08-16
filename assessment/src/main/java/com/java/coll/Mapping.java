package com.java.coll;
import javax.persistence.*;

import com.java.jpa.*;

public class Mapping {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection_Type");

		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		

		

		

		Employee e1 = new Employee();

		e1.setEmp_no(1);

		e1.setEmp_name("RAHUL");
		
		e1.setDes("DAS");
		
		e1.setSal(90000);

		

		Employee e2 = new Employee();

		e2.setEmp_no(2);

		e2.setEmp_name("RAHUL");
		
		e2.setDes("DES");
		
		e2.setSal(950000);
		

		em.persist(e1);

		em.persist(e2);

		em.getTransaction().commit();

		em.close();

		emf.close();

	}

}