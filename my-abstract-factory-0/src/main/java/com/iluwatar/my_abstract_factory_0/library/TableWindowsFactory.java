package com.iluwatar.my_abstract_factory_0.library;

/**
 * Creates windows needed to display the StateMachine as a TABLE
 *
 */
public class TableWindowsFactory implements WindowsAbstractFactory {

	
	
	public StateMachineViewWindow createStateMachineView() {
		return new TableStateMachine();
	}

	public ToolbarWindow createToolbar() {
		return new TableToolbar();
	}

	public BirdviewWindow createBirdview() {
		return new TableBirdview();
	}
	
}
