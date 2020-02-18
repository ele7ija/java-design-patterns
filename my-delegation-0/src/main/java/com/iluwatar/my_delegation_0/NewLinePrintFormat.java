package com.iluwatar.my_delegation_0;

public class NewLinePrintFormat implements PrintFormat {

	public NewLinePrintFormat() { }
	
	public String format(String text) {
		return text + "\n";
	}
	
}
