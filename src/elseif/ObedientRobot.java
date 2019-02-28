package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot Bob= new Robot();
	for(int i=0; i<2; i++) {
	String shape=JOptionPane.showInputDialog("What shape would you like the robot to draw(square or triangle)?");
	if(shape.equals("square")) {
	Bob.setSpeed(50);
	Bob.penDown();
	Bob.move(100);
	Bob.turn(90);
	Bob.move(100);
	Bob.turn(90);
	Bob.move(100);
	Bob.turn(90);
	Bob.move(100);}
	else if(shape.equals("triangle")) {
		Bob.setSpeed(50);
		Bob.penDown();
		Bob.move(250);
		Bob.turn(135);
		Bob.move(325);
		Bob.turn(135);
		Bob.move(250);}
	else {
	JOptionPane.showMessageDialog(null, "Sorry, I don't know that shape.");
	}
	}
}
}
