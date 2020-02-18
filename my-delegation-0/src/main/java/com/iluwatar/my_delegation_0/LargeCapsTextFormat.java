package com.iluwatar.my_delegation_0;

public class LargeCapsTextFormat implements TextFormat {

	public LargeCapsTextFormat() { }
	
	public String format(String text) {
		return text.toUpperCase();
	}
	
}
