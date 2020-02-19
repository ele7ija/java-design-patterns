package com.iluwatar.my_abstract_factory_0;

import java.util.ArrayList;

import com.iluwatar.my_abstract_factory_0.library.Window;
import com.iluwatar.my_abstract_factory_0.library.WindowsAbstractFactory;
import com.iluwatar.my_abstract_factory_0.library.WindowsFactoryMaker;
import com.iluwatar.my_abstract_factory_0.library.WindowsFactoryType;

/**
 * Client uses the library to draw the needed type of
 * windows ({@link Window}).
 *
 */
public class Client {
	private ArrayList<Window> windows;
	private WindowsAbstractFactory waf;
	
	public Client() {
		windows = new ArrayList<Window>();
	}
	
	public void createWindows() {
		addWindow(waf.createStateMachineView());
		addWindow(waf.createToolbar());
		addWindow(waf.createBirdview());
	}
	
	public void drawWindows() {
		for (Window w : windows) {
			w.draw();
		}
	}
	
	public void setType(WindowsFactoryType wft) {
		WindowsFactoryMaker wfm = new WindowsFactoryMaker();
		waf = wfm.makeFactory(wft);
	}
	
	public void addWindow(Window w) {
		windows.add(w);
	}
}
