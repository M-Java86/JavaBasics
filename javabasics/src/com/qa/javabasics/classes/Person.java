package com.qa.javabasics.classes;

//In class Task @10:30 am//
 public class Manager extends employee {
	 
	 private double bonus;
	 
	 public Manager(int id, String name, long salary, double bonus) {
		 
		 super(id, name , salary);
		 this.bonus = bonus;
		 this.bonus = salary + this.bonus;
	 }
	 
	 public Manager(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 
		 Manager mng = new Manager (1, "Manager" 10000, 100);
		 Employee emp = new Employee(2, "Employer", 10000);
		 
		 System.out.println("MANAGER SALARY" + mng.getSalary() + " " + mng.getID());
		 System.out.println("EMPLOYER SALARY" + ((Manager) emp).getSalary() + " " + ((Manager) emp).getID());
	 }

	private String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getSalary() {
		// TODO Auto-generated method stub
		return null;
	}
 }
	
	
	

	
	 	
 


