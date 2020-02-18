package com.iluwatar.my_factory_method_0.library;

import java.util.ArrayList;
import java.util.Calendar;

public abstract class Resource {
	private boolean active;
	private Calendar dateAdded;
	private Calendar dateRemoved;
	private ArrayList<String> activities;
	
	public abstract String logFormat();
	
	public Resource() {
		active = true;
		dateAdded = Calendar.getInstance();
	}
	
	public Resource(boolean active, Calendar dateAdded, Calendar dateRemoved, ArrayList<String> activities) {
		super();
		this.active = active;
		this.dateAdded = dateAdded;
		this.dateRemoved = dateRemoved;
		this.activities = activities;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Calendar getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Calendar dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Calendar getDateRemoved() {
		return dateRemoved;
	}

	public void setDateRemoved(Calendar dateRemoved) {
		this.dateRemoved = dateRemoved;
	}

	public ArrayList<String> getActivities() {
		return activities;
	}

	public void setActivities(ArrayList<String> activities) {
		this.activities = activities;
	}
	
	
}
