package com.iluwatar.my_bridge_0;

public abstract class Window {
	ColorMode cm;
	
	public Window() {
		cm = new LightColorMode();
	}
	
	public Window(ColorMode cm) {
		this.cm = cm;
	}
	
	public abstract void draw();
}
