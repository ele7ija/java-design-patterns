package com.iluwatar.my_factory_method_0.library;

import java.util.ArrayList;
import java.util.Calendar;

public class Database extends Resource {
	private String ip;
	private String type;
		
	public Database(String ip, String type) {
		super();
		this.ip = ip;
		this.type = type;
	}
	public Database() {
		super();
	}
	
	public Database(boolean active, Calendar dateAdded, Calendar dateRemoved, ArrayList<String> activities, String ip,
			String type) {
		super(active, dateAdded, dateRemoved, activities);
		this.ip = ip;
		this.type = type;
	}
	
	@Override
	public String logFormat() {
		return "Database[IP="+ip+";TYPE="+type+"]";
	}
	
}
