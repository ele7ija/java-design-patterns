package com.iluwatar.my_delegation_0;

public class SmallCapsTextFormat implements TextFormat {

	public SmallCapsTextFormat() {}
	
	public String format(String text) {
		return text.toLowerCase();
	}

}
