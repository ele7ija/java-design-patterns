package com.iluwatar.my_abstract_factory_0.library;

public class WindowsFactoryMaker {
	
	public WindowsAbstractFactory makeFactory(WindowsFactoryType wft) {
		switch (wft) {
		case TABLE:
			return new TableWindowsFactory();
		case UML:
			return new UmlWindowsFactory();
		default:
			throw new RuntimeException("Unknown WindowsFactoryType");
		}
	}
}
