package com.github.ele7ija.my_delegation_0;

/**
 * Simulates use cases of the {@link ComplexClass}
 */
public class App 
{
    public static void main( String[] args )
    {
    	ComplexClass cc = new ComplexClass();
    	cc.setText("Niko ne sme da vas bije!");
    	cc.printText();
    	
    	cc.toLargeCaps();
    	cc.printText();
    	
    	cc.toNoNewLinePrintFormat();
    	cc.printText();
    }
}
