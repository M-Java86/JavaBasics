package com.qa.javabasics.classes;

class Runner {

	public static void main(String[] args) {
		//START
		System.out.println("APP START");
		
		
		Person bob = new Person("Bob", 32, "male");
		
		System.out.println(bob.speak("Hello!"));
		
		
		System.out.println("APP END");
		//END
	}
		
}
