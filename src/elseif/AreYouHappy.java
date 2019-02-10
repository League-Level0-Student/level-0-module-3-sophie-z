package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String two="";
	String one=JOptionPane.showInputDialog("Are you happy? (please answer in yes or no)");
	if(one.equals("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");}
	if(one.equals("no")){
		two=JOptionPane.showInputDialog(null, "Do you want to be happy?");}
	if(two.equals("yes")){
	JOptionPane.showMessageDialog(null, "Change something.");}
	if(two.equals("no")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");}
}
}
