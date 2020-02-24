package com.iluwatar.my_decorator_0;

/**
 * Base Ball class - only defines its shape.
 * This is not an abstract class because my intention was
 * to have a way to define all the balls in some game - some
 * are movable and some are not.
 * @author Bojan
 *
 */
public class Ball {
	
	private double x, y;
	private double r, weight;
	private String color;
	
	public Ball() {
		super();
	}
	
	public Ball(double x, double y, double r, double weight, String color) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
		this.weight = weight;
		this.color = color;
	}
	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
