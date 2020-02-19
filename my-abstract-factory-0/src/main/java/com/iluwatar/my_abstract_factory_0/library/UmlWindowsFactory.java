package com.iluwatar.my_abstract_factory_0.library;

/**
 * Creates windows needed to display the StateMachine as a UML
 *
 */
public class UmlWindowsFactory implements WindowsAbstractFactory {

	public StateMachineViewWindow createStateMachineView() {
		return new UmlStateMachine();
	}

	public ToolbarWindow createToolbar() {
		return new UmlToolbar();
	}

	public BirdviewWindow createBirdview() {
		return new UmlBirdview();
	}

}
