package com.iluwatar.my_abstract_factory_0;

import com.iluwatar.my_abstract_factory_0.library.WindowsFactoryType;

/**
 * Use-case of the {@link Client} app
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client c1 = new Client();
        c1.setType(WindowsFactoryType.TABLE);
        c1.createWindows();
        c1.drawWindows();
        
        Client c2 = new Client();
        c2.setType(WindowsFactoryType.UML);
        c2.createWindows();
        c2.drawWindows();
    }
}
