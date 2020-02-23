package com.iluwatar.my_bridge_0;

public class ToolboxWindow extends Window {

	public ToolboxWindow() {
		super();
	}

	public ToolboxWindow(ColorMode cm) {
		super(cm);
	}

	@Override
	public void draw() {
		System.out.println("Toolbox window with color "+cm.primaryColor()+" drawn.");

	}

}
