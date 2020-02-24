package com.iluwatar.my_decorator_0;

/**
 * MovableBall is the base for decorators.
 * @author Bojan
 *
 */
public class MovableBall extends Ball {
	
	private double dx, dy; // m/s change
	
	public void move() {
		setX(getX() + dx);
		setY(getY() + dy);
	}
	
	/**
	 * Funny caveat is that this has to be overriden
	 * by the decorators so that they display the
	 * movable ball they decorate 
	 */
	public void display() {
		System.out.println("MovableBall[(" + getX() + ", " + getY() + ") with (" + dx + ", " + dy + ")]");
	}
	
	public MovableBall() {
		super();
	}

	public MovableBall(double dx, double dy) {
		super();
		this.dx = dx;
		this.dy = dy;
	}
	public MovableBall(double x, double y, double r, double weight, String color, double dx, double dy) {
		super(x, y, r, weight, color);
		this.dx = dx;
		this.dy = dy;
	}

	public double getDx() {
		return dx;
	}

	public void setDx(double dx) {
		this.dx = dx;
	}

	public double getDy() {
		return dy;
	}

	public void setDy(double dy) {
		this.dy = dy;
	}
	
}
