package com.github.ele7ija.my_delegation_0;

public class NewLinePrintFormat implements PrintFormat {

	public NewLinePrintFormat() { }
	
	public String format(String text) {
		return text + "\n";
	}
	
}
