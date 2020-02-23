package com.iluwatar.my_bridge_0;

public class GraphViewWindow extends Window {

	public GraphViewWindow() {
		super();
	}

	public GraphViewWindow(ColorMode cm) {
		super(cm);
	}

	@Override
	public void draw() {
		System.out.println("GraphViewWindow with color "+cm.primaryColor()+" drawn");

	}

}
