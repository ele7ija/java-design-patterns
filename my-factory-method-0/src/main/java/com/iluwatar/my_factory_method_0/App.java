package com.iluwatar.my_factory_method_0;

import com.iluwatar.my_factory_method_0.library.Resource;
import com.iluwatar.my_factory_method_0.library.ResourceType;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client c = new Client();
        
        c.addResource(ResourceType.VM);
        c.addResource(ResourceType.DRIVE);
        c.addResource(ResourceType.DB);
        for (Resource r : c.getResources()) {
        	System.out.println(r.logFormat());
        }
    }
}
