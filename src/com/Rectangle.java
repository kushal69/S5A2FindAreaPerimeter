package com;

//	Rectangle extending Figure to implement the its abstract methods to find Area and Perimeter
public class Rectangle extends Figure {
	void findArea() {
		double area = dim1 * dim2;	//	Formula to find the Area of the Rectangle
		System.out.println("Area of the rectangle is " + area);
	}

	void findPerimeter() {
		double perimeter = 2 * (dim1 + dim2);	//	Formula to find the Perimeter of the Rectangle
		System.out.println("Perimeter of the rectangle is " + perimeter);
	}
}
