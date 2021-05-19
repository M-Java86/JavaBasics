package com.qa.javabasics.classes;

//In class walk through//
public class Person {
  
	public String name;
  public float height;
  public int age;
  public String eyecolor;
  public String ethnicity;
  public String gender;
  public boolean isBreathing;
  public int walkSpeed = 30; // in feet 
  
  
  //Constructor
  public Person() {
	  System.out.println("Your Person class has been created!");
  }


  
  public static void read() {
	  System.out.println("{name} is reading the book title: {given}");
  }
  public boolean isStillBreathing() {
	  return isBreathing;
  }

  public String speak (String msg) {
	  return "{name} says: " +msg;
  }
  
  public int walk() {
	  return walkSpeed; 
  }
}

  
  
  
 


