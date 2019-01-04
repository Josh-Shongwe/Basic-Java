/*
 * File: Target.java
 * Name: Joshua Shongwe
 * Section Leader: Irene Han
 * -----------------
 * This program creates a target centered in the middle of the frame. Consisting of three GOval objects
 * the outer circle and inner circle are red, while the middle circle is white.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	private static final double outerRadius = 72;
	private static final double diffRadius = 25.2;
	private static final double midRadius = 46.8;

	public void run() {
		target();
	}
	public void target() {
		//Finds the center of the window and subtracts of the difference in radius to be placed in the center.
		double centerX = getWidth()/2 - diffRadius;
		double centerY = getHeight()/2 - diffRadius;

		//Creates a circle to be placed with a 1-inch radius at the determined x and y-coordinates.
		GOval bigCircle = new GOval (centerX, centerY, outerRadius, outerRadius);
		//Sets the outside circle's color to red.
		bigCircle.setColor(Color.RED);
		bigCircle.setFilled(true);
		//Draws outer circle.
		add(bigCircle);

		//Finds the center of the window and subtracts half the difference in radius to be placed in the center.
		GOval midCircle = new GOval(getWidth()/2 - diffRadius/2, getHeight()/2 - diffRadius/2, midRadius, midRadius);
		//Sets the middle circle's color to white.
		midCircle.setColor(Color.WHITE);
		midCircle.setFilled(true);
		//Draws middle circle.
		add(midCircle);

		//Finds the center of the window.
		GOval innerCircle = new GOval (getWidth()/2, getHeight()/2, (midRadius - diffRadius), (midRadius - diffRadius) );
		//Sets the inner circle's color to red.
		innerCircle.setColor(Color.RED);
		innerCircle.setFilled(true);
		//Draws inner circle.
		add(innerCircle);
	}

}
