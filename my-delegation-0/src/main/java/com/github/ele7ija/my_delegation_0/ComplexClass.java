package com.github.ele7ija.my_delegation_0;

/**
 * 
 * Class that models some high-level behavior.
 * It delegates some of the work to the {@link TextFormat},
 * and some to the {@link PrintFormat} interfaces.
 * The advantage of this pattern is that another implementation
 * of the TextFormat or PrintFormat interfaces can easily be
 * added in any part of life cycle of the Application.
 * 
 *
 */
public class ComplexClass {
	/* ... */
	
	private String text;
	
	private TextFormat tf;
	private PrintFormat pf;
	
	public ComplexClass() {
		tf = new SmallCapsTextFormat();
		pf = new NewLinePrintFormat();
	}
	
	public void printText() {
		System.out.print(pf.format(tf.format(text)));
	}
	
	/**
	 * Changes the text format to LargeCaps.
	 * Method should be private as it should only be called from 
	 * an internal controller.
	 */
	public void toLargeCaps() {
		tf = new LargeCapsTextFormat();
	}
	
	public void toSmallCaps() {
		tf = new SmallCapsTextFormat();
	}
	
	/**
	 * Changes the print format to NewLine.
	 * Method should be private as it should only be called from
	 * an internal controller. 
	 */
	public void toNewLinePrintFormat() {
		pf = new NewLinePrintFormat();
	}

	public void toNoNewLinePrintFormat() {
		pf = new NoNewLinePrintFormat();
	}
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextFormat getTf() {
		return tf;
	}

	public void setTf(TextFormat tf) {
		this.tf = tf;
	}

	public PrintFormat getPf() {
		return pf;
	}

	public void setPf(PrintFormat pf) {
		this.pf = pf;
	}
}
