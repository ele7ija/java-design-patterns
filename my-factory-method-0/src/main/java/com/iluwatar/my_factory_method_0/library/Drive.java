package com.iluwatar.my_factory_method_0.library;

import java.util.ArrayList;
import java.util.Calendar;

public class Drive extends Resource {
	private int capacity;
	private int rpms;
	
	public Drive(boolean active, Calendar dateAdded, Calendar dateRemoved, ArrayList<String> activities, int capacity,
			int rpms) {
		super(active, dateAdded, dateRemoved, activities);
		this.capacity = capacity;
		this.rpms = rpms;
	}
	public Drive() {
		super();
	}

	@Override
	public String logFormat() {
		return "Drive[CAPACITY="+capacity+";RPMS="+rpms+"]";
	}
	
	
}
