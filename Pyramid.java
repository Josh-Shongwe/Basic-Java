/*
 * File: Pyramid.java
 * Name: Joshua Shongwe
 * Section Leader: Irene Han
 * ------------------
 * This program creates a 14-row pyramid with multi-colored bricks./
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	public void run() {

		pyramid();

	}

	private void pyramid() {
		//Loops through and sets the brick count for the appropriate row.
		for(int rows = 0; rows < 14; rows++) {
			int brickCount = BRICKS_IN_BASE - rows;
			//Sets down the bricks in the specific column.
			for(int column = 0; column < brickCount; column++) {
				//Calculates the center.
				double center =  ( (getWidth() / 2)  );
				//Calculates the new x-coordinate and y-coordinate.
				double coordX = ( ( (center - brickCount * BRICK_WIDTH /2  + column * BRICK_WIDTH) ) );

				//Determines the lateral location of the brick.
				double coordY = ( getHeight()  - BRICK_HEIGHT * (rows + 1));

				//Creates the brick at the respective (x,y) with the appropriate dimensions.
				GRect block = new GRect( coordX , coordY, BRICK_WIDTH, BRICK_HEIGHT) ;

				//Extension: A black & white pyramid is boring. Look at the calculated, random pretty colors.
				int color = (int) (Math.random() * 10 ) + 1;
				if (color == 1) {
					block.setColor(Color.RED);
				}else if(color == 2) {
					block.setColor(Color.BLACK);
				}else if(color == 3) {
					block.setColor(Color.CYAN);
				}else if(color == 4) {
					block.setColor(Color.DARK_GRAY);
				}else if(color == 5) {
					block.setColor(Color.GREEN);
				}else if(color == 6) {
					block.setColor(Color.MAGENTA);
				}else if(color == 7) {						
					block.setColor(Color.YELLOW);
				}else if(color == 8) {
					block.setColor(Color.PINK);
				}else if(color == 9) {
					block.setColor(Color.ORANGE);
				}else if(color == 10) {
					block.setColor(Color.BLUE);
				}


				add(block);

			}
		}
	}
}

