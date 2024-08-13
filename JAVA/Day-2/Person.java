package com.assignment2;

public class Person {
	String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("JB", 20);
        Person person2 = new Person("Surya", 19);

        // Print their name and age
        System.out.println("Person 1:");
        person1.displayPersonInfo();
        
        System.out.println("\nPerson 2:");
        person2.displayPersonInfo();

	}

}
