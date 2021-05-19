package com.qa.javabasics.classes;

//In class walk through//
public class Person { // When creating this class, we can not use the static keyword because the static keyword doesn't work well with the new
	//keyword. Static doesn't represent attributes in the same way than a non attributes works//
  
	public String name;
  public float height;
  public int age;
  public String eyecolor;
  public String ethnicity;
  public String gender;
  public boolean isBreathing;
  public int walkSpeed = 30; // in feet 
  
  
  //Constructor
  public Person(String name, int age, String gender) {
	this.name = name;
	  this.age = age;
	  this.gender = gender;
	  
	  //System.out.println("Your Person class has been created!");
  }


  public static void read() {
	  //System.out.println(this.name + " is reading the book titled: {given}");
  }
  public boolean isStillBreathing() {
	  return isBreathing;
  }

  public String speak (String msg) {
	  return this.name + " says: " + msg;
  }
  
  public int walk() {
	  return walkSpeed; 
  }
}

  
  
  
 


