
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot bob = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		bob.setX(350);
		bob.setSpeed(500);
		bob.penDown();
		for(int x=0; x<5; x++) {
		bob.move(100);
		bob.turn(144);
		bob.move(100);
		bob.turn(288);}
			}

		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

