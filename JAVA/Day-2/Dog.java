package com.assignment2;

public class Dog {
	String name;
	String breed;
	Dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
	void display() {
		System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1=new Dog("caster","Pomerian");
		Dog dog2=new Dog("Huber","PitBull");
		dog1.display();
		dog2.display();
		
		
		dog1.setName("Buddy");
		dog1.setBreed("Lab");
		
		dog2.setName("Harley");
		dog2.setBreed("Huskey");
		
		dog1.display();
		dog2.display();
		

	}

}
