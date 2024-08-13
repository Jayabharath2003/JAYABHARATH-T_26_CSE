package com.assignment2;

public class Rectangle {
	int width;
	int height;
public Rectangle(int width,int height) {
    this.width = width;
    this.height = height;
}
public int calculateArea() {
    return width * height;
}
public int calculatePerimeter() {
    return 2 * (width + height);
}
public void displayRectangleInfo() {
    System.out.println("Width: " + width);
    System.out.println("Height: " + height);
    System.out.println("Area: " + calculateArea());
    System.out.println("Perimeter: " + calculatePerimeter());
}
	public static void main (String[] args) {
		Rectangle rectangle1=new Rectangle(5,8);
		Rectangle rectangle2=new Rectangle(7,9);
		
		
		rectangle1.displayRectangleInfo();
		rectangle2.displayRectangleInfo();
		
		
	}
}
