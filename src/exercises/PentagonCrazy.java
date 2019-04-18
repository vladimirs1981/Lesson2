package exercises;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(10);
		r2d2.setPenColor(0, 0, 122);
		
		int side = 6;
		int angle = 247/side;
		
			for (int i = 0; i < 200; i++) {
			
			r2d2.move(i);
			
			r2d2.turn(angle+1);
			
			}	
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern 
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}