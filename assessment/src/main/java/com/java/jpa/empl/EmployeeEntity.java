package com.java.jpa.empl;

import javax.persistence.*;

@Entity

@Table(name="EmpInformation")

public class EmployeeEnt {

  @Id

  private int EmpNo;

  private String EmpName;

  private String Desg;
  private double Sal;

  public EmployeeEnt(int EmpNo, String EmpName, String Desg,double Sal) {

    super();

    this.EmpNo = EmpNo;

    this.EmpName = EmpName;

    this.Desg = Desg;
    this.Sal = Sal;
  }

  public EmployeeEnt() {

    super();

  }

public int getEmpNo() {
	return EmpNo;
}

public void setEmpNo(int EmpNo) {
	this.EmpNo = EmpNo;
}

public String getEmpName() {
	return EmpName;
}

public void setEmpname(String EmpName) {
	this.EmpName = EmpName;
}

public String getDesignation() {
	return Desg;
}

public void setDesignation(String Desg) {
	this.Desg= Desg;
}

public double getSal() {
	return Sal;
}

public void setSal(double Sal) {
	this.Sal = Sal;
}

 

}