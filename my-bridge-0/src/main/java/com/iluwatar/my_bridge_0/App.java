package com.iluwatar.my_bridge_0;

import java.util.ArrayList;

/**
 * The advantage of this structure (combining inheritance and composition)
 * is that we did not have to create additional classes like
 * DarkGraphViewWindow or LightToolboxWindow.
 * Note: The way this is implemented, not all windows have to be of the
 * same style.
 */
public class App 
{
    public static void main( String[] args )
    {
        ColorMode cm = new LightColorMode();
        ArrayList<Window> windows = createWindows(cm);
        drawWindows(windows);
        
        cm = new DarkColorMode();
        windows = createWindows(cm);
        drawWindows(windows);
    }

	private static void drawWindows(ArrayList<Window> windows) {
		for (Window w : windows) {
			w.draw();
		}
	}

	private static ArrayList<Window> createWindows(ColorMode cm) {
		ArrayList<Window> retval = new ArrayList<Window>();
		retval.add(new GraphViewWindow(cm));
		retval.add(new ToolboxWindow(cm));
		return retval;
	}
}
