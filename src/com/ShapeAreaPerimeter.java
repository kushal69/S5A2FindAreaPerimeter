package com;

import java.util.Scanner;

public class ShapeAreaPerimeter {

	//	Main Function
	public static void main(String[] args) {
		Figure circle = new Circle();	//	Creating the new Circle object with Figure Class
		System.out.println("Area and Perimeter of CIRCLE");
		Scanner in = new Scanner(System.in);	//	Scanner to get the user input 

		System.out.print("Enter the radius : ");
		circle.dim1 = in.nextDouble();
		
		System.out.println();
		//	Calling the Area and Perimeter calculating methods of the circle 
		circle.findArea();
		circle.findPerimeter();
		
		System.out.println("-----------------------------------------------------------");

		Figure rectangle = new Rectangle();
		System.out.println("Area and Perimeter of RECTANGLE");

		System.out.print("Enter the length : ");
		rectangle.dim1 = in.nextDouble();

		System.out.print("Enter the breadth : ");
		rectangle.dim2 = in.nextDouble();
		
		System.out.println();
		//		Calling the Area and Perimeter calculating methods of the rectangle 
		rectangle.findArea();
		rectangle.findPerimeter();
		
		System.out.println("-----------------------------------------------------------");

		Figure triangle = new Triangle();
		System.out.println("Area and Perimeter of TRIANGLE");
		
		System.out.print("Enter the side : ");
		triangle.dim1 = in.nextDouble();
		
		System.out.print("Enter the base : ");
		triangle.dim2 = in.nextDouble();
		
		System.out.print("Enter the side : ");
		triangle.dim3 = in.nextDouble();
		
		System.out.println();
		//		Calling the Area and Perimeter calculating methods of the triangle 
		triangle.findArea();
		triangle.findPerimeter();
		
		System.out.println("***********************************************************");
		in.close();
	}
}
