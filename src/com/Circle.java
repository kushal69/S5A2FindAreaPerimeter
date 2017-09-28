package com;

//	Circle extending Figure to implement the its abstract methods to find Area and Perimeter
public class Circle extends Figure {
	void findArea() {
		double area = (22 * dim1 * dim1) / 7;		//	Formula to find the Area of the Circle
		System.out.println("Area of the circle is " + area);
	}

	void findPerimeter() {
		double perimeter = 2 * (22 * dim1) / 7;		//	Formula to find the Perimeter of the Circle
		System.out.println("Perimeter of the circle is " + perimeter);
	}
}
