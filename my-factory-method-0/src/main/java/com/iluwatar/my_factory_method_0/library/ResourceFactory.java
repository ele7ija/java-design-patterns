package com.iluwatar.my_factory_method_0.library;

public class ResourceFactory {

	/**
	 * 
	 * @param rt - The type of resource that will be created
	 * @return - Concrete resource object
	 */
	public Resource getInstance(ResourceType rt) {
		switch (rt) {
		case DRIVE:
			return new Drive();
		case DB:
			return new Database();
		case VM:
			return new VirtualMachine();
		default:
			throw new RuntimeException("Unknown type of resource");
		}
	}
}
