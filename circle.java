/*
 * circlefunctions.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * basic class stuff
 * 
 * 
 */


public class circle {
	private double radius;
	private double pi = 3.14; 
	
	public void dimensions(double newRadius) {
		radius = newRadius;	
		}
	public double calcArea(){
		return (radius * radius) * pi;
		}
	public double calcDiameter(){
		return (2 * radius);
		}
	public double calcCircumference(){
		return 2 * pi * radius;
		}
	
	public static void main (String args[]) {
		circle Earth = new circle();
		Earth.dimensions(6371.39);
		System.out.println("the area is " + Earth.calcArea());
		System.out.println("the diameter is " + Earth.calcDiameter());
		System.out.println("the  circumference is " + Earth.calcCircumference());				
	}
}

