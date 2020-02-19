package com.iluwatar.my_abstract_factory_0.library;

/**
 * Specifies what a concrete Factory needs to be able to create.
 * 
 */
public interface WindowsAbstractFactory {
	
	public StateMachineViewWindow createStateMachineView();
	public ToolbarWindow createToolbar();
	public BirdviewWindow createBirdview();
	
}
