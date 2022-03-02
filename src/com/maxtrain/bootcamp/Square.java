package com.maxtrain.bootcamp;

public class Square extends Rect {
	
	public Square(int sides) {
		super(sides, sides);		
	}
	
	//default constructor that passes up to another constructor in 
	//this class
	public Square() {
		this(5);
	}

}
