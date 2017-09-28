package com;

//	Triangle extending Figure to implement the its abstract methods to find Area and Perimeter
public class Triangle extends Figure {
	void findArea() {
		//		Formulas to find the Area of the Triangle
		double halfPerimeter = (dim1 + dim2 + dim3) / 2;
		double area = Math.sqrt(halfPerimeter * ((halfPerimeter - dim1) * (halfPerimeter - dim2) * (halfPerimeter - dim3)));
		System.out.println("Area of the square is " + area);
	}

	void findPerimeter() {
		double perimeter = dim1 + dim2 + dim3;	//	Formula to find the Perimeter of the Triangle
		System.out.println("Perimeter of the square is " + perimeter);
	}
}
