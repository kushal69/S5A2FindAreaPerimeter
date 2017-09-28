package com;

//	Abstract Class with the given properties of the Figure and the abstract methods to be implemented in the subclasses
public abstract class Figure {
	//	Dimension variables
	double dim1;
	double dim2;
	double dim3;
	
	//	Abstract Methods
	abstract void findArea();
	abstract void findPerimeter();
}
