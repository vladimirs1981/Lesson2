package optional;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/* Before beginning recipe: 
* 1. ask students to find and explain the method in this recipe. 
* 2. ask students how they might use the method to make the picture in the laminated hand-outs. */

public class StarShow {
	
	Robot robot = new Robot("batman");
	
	void makeStars() {
		
		robot.setSpeed(10);
		float x = 10;
		float y = 950;
		int starSize = 25;
		
			for (int i = 0; i < 30; i++) {
				
				robot.setPenWidth(i);
				robot.setPos(x, y);
			
			drawStar(starSize);
			x += starSize;
			y -= starSize;
			starSize +=20; 
			
			robot.turn(12);
			robot.setRandomPenColor(); 
			
			}
	}

	private void drawStar(int starSize) {
			
			robot.penDown();
		
			for (int i = 0; i < 5; i++) {
				robot.move(starSize);
				robot.turn(144);	
			}	
	}
	
	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}





