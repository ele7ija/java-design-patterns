package com.iluwatar.my_factory_method_0;

import java.util.ArrayList;

import com.iluwatar.my_factory_method_0.library.Resource;
import com.iluwatar.my_factory_method_0.library.ResourceFactory;
import com.iluwatar.my_factory_method_0.library.ResourceType;

/**
 * Stores resources.
 * The addition of new resources is decoupled from the
 * client. 
 */
public class Client {
	private ArrayList<Resource> resources;
	private ResourceFactory rf;
	
	public Client() {
		resources = new ArrayList<Resource>();
		rf = new ResourceFactory();
	}
	
	/**
	 * Without the factory, client would have to
	 * switch through all the resource types and instantiate
	 * the concrete object.
	 * @param rt
	 */
	public void addResource(ResourceType rt) {
		Resource r = rf.getInstance(rt);
		resources.add(r);
	}

	public ArrayList<Resource> getResources() {
		return resources;
	}

	public void setResources(ArrayList<Resource> resources) {
		this.resources = resources;
	}

	public ResourceFactory getRf() {
		return rf;
	}

	public void setRf(ResourceFactory rf) {
		this.rf = rf;
	}
	
	
}
