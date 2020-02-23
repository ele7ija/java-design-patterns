package com.iluwatar.my_bridge_0;

/***
 * The return type `String` is not adequate for applications
 * with different color formats. This app works with the
 * standard HTML RGB format
 *
 */
public interface ColorMode {

	String primaryColor();
	String secondaryColor();
	String accentsColor();
}
