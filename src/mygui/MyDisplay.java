package mygui;

import processing.core.PApplet;

public class MyDisplay extends PApplet {
	
	public void setup() {
		size (400, 600);
		background(100,100,100);
		
		
	}
	
	public void draw() {
		fill(255,255,0);
		ellipse(200,200, 375,375);
		fill(0,0,0);
		ellipse(120,130, 55,75);
		ellipse(280,130, 55,75);
		
		arc(200,280,75,75,0,PI);
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
	

}
