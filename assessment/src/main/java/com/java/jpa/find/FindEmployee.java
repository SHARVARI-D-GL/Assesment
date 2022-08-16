package com.java.jpa.find;


import javax.persistence.*;

import com.java.jpa.employee.*;

public class FindEmployee {

  public static void main(String args[])

  {

    EntManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

    EntManager em=emf.createEntityManager();

    EmployeeEnt s=em.find(EmployeeEnt.class,101);

    System.out.println("Employee id = "+s.getEmpNo());

    System.out.println("Employee Name = "+s.getEmpName());

    System.out.println("Designation = "+s.getDesg());
    
    System.out.println("Salary = "+s.getSal());

  }

}