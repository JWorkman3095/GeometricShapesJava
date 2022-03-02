package com.maxtrain.bootcamp;

class Rect extends Quad {
	
	public int area() {
		return super.getSide1() * super.getSide2();
	}
	
	public Rect(int side1, int side2) {
		super(side1, side2, side1, side2);
	}
}
