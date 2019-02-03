//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot bob = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int i=0; i<25; i++) {
		String color = JOptionPane.showInputDialog("What color would you like the robot to draw?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equals("red")) {
		bob.setPenColor(Color.red);}
		if(color.equals("orange")) {
		bob.setPenColor(Color.orange);}
		if(color.equals("yellow")) {
		bob.setPenColor(Color.yellow);}
		if(color.equals("green")) {
		bob.setPenColor(Color.green);}
		if(color.equals("blue")) {
		bob.setPenColor(Color.blue);}
		if(color.equals("purple")) {
		bob.setPenColor(Color.magenta);}
		//6. If the user doesn’t enter anything, choose a random color
		else {
		bob.setPenColor(Color.blue);
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bob.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		bob.setSpeed(500);
		bob.penDown();
		bob.move(100);
		bob.turn(90);
		bob.move(100);
	}
	}
}
