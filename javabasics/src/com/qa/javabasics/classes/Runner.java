package com.qa.javabasics.classes;

class Runner {

	public static void main(String[] args) {
		//START
		System.out.println("APP START");
		
		
		Person bob = new Person("Bob", 32, "male");
		Person personVar = new Person("Charlotte", 28, "Female");
		//Person trainer = new Person("Alan", 37, "Male");
		
		//bob.read(new Book("title here"));
		
		System.out.println(personVar.gender);
		
		
		System.out.println("APP END");
		//END
	}
		
}
