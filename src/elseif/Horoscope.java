package elseif;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String starsign=JOptionPane.showInputDialog("What is your star sign?");
if(starsign.equals("Aries")){
	JOptionPane.showMessageDialog(null, "Courageous, energetic, willful, commanding, leading. Often leads when following would be best course of action.");}	
else if(starsign.equals("Taurus")){
	JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable, grounded, provokes slowly, and highly sensual in nature.");}
else if(starsign.equals("Gemini")){
	JOptionPane.showMessageDialog(null, "Cerebral, chatty, loves learning and education, charming, and adventurous.");}	
else if(starsign.equals("Cancer")){
	JOptionPane.showMessageDialog(null, "Emotional, group oriented, seeks security, family.");}
else if(starsign.equals("Leo")){ 
	JOptionPane.showMessageDialog(null, "Generous, organized, protective, beautiful.");}
else{
	JOptionPane.showMessageDialog(null, "That's not a star sign! (or it is just not in the program...)");}
}
}