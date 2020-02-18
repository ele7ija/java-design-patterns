package com.iluwatar.my_factory_method_0.library;

import java.util.ArrayList;
import java.util.Calendar;

public class VirtualMachine extends Resource {
	private String ip;
	private String category;

	public VirtualMachine(boolean active, Calendar dateAdded, Calendar dateRemoved, ArrayList<String> activities,
			String ip, String category) {
		super(active, dateAdded, dateRemoved, activities);
		this.ip = ip;
		this.category = category;
	}
	public VirtualMachine() {
		super();
	}
	
	@Override
	public String logFormat() {
		return "VirtualMachine[IP="+ip+";CATEGORY="+category+"]";
	}

}
