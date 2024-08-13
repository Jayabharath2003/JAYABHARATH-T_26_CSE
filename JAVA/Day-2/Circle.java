package com.assignment2;

public class Circle {
	float radius;
public Circle(float radius) {
    this.radius = radius;
}
public float calculateArea() {
    return 3.14f*radius*radius;
}
public float calculateCircumference() {
    return 2*3.14f*radius;
}
public void displayCircleInfo() {
    System.out.println("Radius: " + radius);
    System.out.println("Area: " + calculateArea());
    System.out.println("Circumference: " + calculateCircumference());
}
	public static void main (String[] args) {
		Circle rectangle1=new Circle(5);
		Circle rectangle2=new Circle(7);
		
		
		rectangle1.displayCircleInfo();
		rectangle2.displayCircleInfo();
		
		
	}
}
