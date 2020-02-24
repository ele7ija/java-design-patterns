package com.iluwatar.my_decorator_0;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MovableBall mb = new DeceleratingBall(
        					new BoundedBall(
        						new BasketBall(0, 0, 1, 1, "Brown", 1, 1),
        						0, 0, 5, 5),
        					0.95);
        mb.move(); mb.display();
        mb.move(); mb.display();
        mb.move(); mb.display();
        mb.move(); mb.display();
        mb.move(); mb.display();
        mb.move(); mb.display();
    }
}
