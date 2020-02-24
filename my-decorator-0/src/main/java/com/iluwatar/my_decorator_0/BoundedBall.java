package com.iluwatar.my_decorator_0;

/**
 * Decorator that defines the boundary for a MovableBall
 * Constructor without the MovableBall that ought to be
 * moved DOESN'T exist purposefully.
 * @author Bojan
 *
 */
public class BoundedBall extends MovableBall {
	private MovableBall mb;
	private int tlx, tly, brx, bry; // emulates the frame	
	
	@Override
	public void move() {
		mb.move();
		System.out.println("Checking the boundary...");
		if (tlx > mb.getX() || tly > mb.getY() || brx < mb.getX() || bry < mb.getY()) {
			System.out.println("Ball is out of boundary. Setting the position to the previous one.");
			mb.setX(mb.getX() - mb.getDx());
			mb.setY(mb.getY() - mb.getDy());
		}
	}
	
	@Override
	public void display() {
		System.out.print("BoundedBall[");
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
	public double getDx() {
		return mb.getDx();
	}
	@Override
	public double getDy() {
		return mb.getDy();
	}
	public BoundedBall(MovableBall mb) {
		super();
		this.mb = mb;
	}
	public BoundedBall(MovableBall mb, int tlx, int tly, int brx, int bry) {
		super();
		this.mb = mb;
		this.tlx = tlx;
		this.tly = tly;
		this.brx = brx;
		this.bry = bry;
	}

	public MovableBall getMb() {
		return mb;
	}

	public void setMb(MovableBall mb) {
		this.mb = mb;
	}

	public int getTlx() {
		return tlx;
	}

	public void setTlx(int tlx) {
		this.tlx = tlx;
	}

	public int getTly() {
		return tly;
	}

	public void setTly(int tly) {
		this.tly = tly;
	}

	public int getBrx() {
		return brx;
	}

	public void setBrx(int brx) {
		this.brx = brx;
	}

	public int getBry() {
		return bry;
	}

	public void setBry(int bry) {
		this.bry = bry;
	}

	
}
