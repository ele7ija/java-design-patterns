package com.iluwatar.my_decorator_0;

public class DeceleratingBall extends MovableBall {
	MovableBall mb;
	private double coefficient;
	
	@Override
	public void move() {
		mb.move();
		System.out.println("Decelerating...");
		mb.setDx(mb.getDx() * coefficient);
		mb.setDy(mb.getDy() * coefficient);
	}
	@Override
	public void display() {
		System.out.print("DeceleratingBall[");
		mb.display();
		System.out.print("]");
	}
	
	@Override
	public void setDx(double dx) {
		mb.setDx(dx);
	}
	@Override
	public void setDy(double dy) {
		mb.setDy(dy);
	}
	@Override
	public void setX(double x) {
		mb.setX(x);
	}
	@Override
	public void setY(double y) {
		mb.setY(y);
	}
	public DeceleratingBall(MovableBall mb) {
		super();
		this.mb = mb;
	}
	public DeceleratingBall(MovableBall mb, double coeff) {
		super();
		this.mb = mb;
		this.coefficient = coeff;
	}
	
}
