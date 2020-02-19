package com.iluwatar.my_abstract_factory_0.library;

/**
 * An App contains a main window which contains other windows.
 *
 */
public abstract class Window {
	private int x, y, width, height;
	private Window parent;
	
	public abstract void draw();
	
	public Window() {
		super();
	}
	public Window(int x, int y, int width, int height, Window parent) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.parent = parent;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Window getParent() {
		return parent;
	}

	public void setParent(Window parent) {
		this.parent = parent;
	}
	
	
}
