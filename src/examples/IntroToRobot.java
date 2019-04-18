package examples;

import org.jointheleague.graphical.robot.Robot;

public class IntroToRobot {
	public static void main(String[] args) {

		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setPenWidth(20);
		r2d2.setSpeed(10);
		for (int i = 0; i < 4; i++) {
			r2d2.setRandomPenColor();
			r2d2.move(100);
			r2d2.turn(90);
		}
		for (int i = 0; i < 4; i++) {
			r2d2.setRandomPenColor();
			r2d2.turn(90);
			r2d2.move(100);
		}
		r2d2.turn(180);
		for (int i = 0; i < 4; i++) {
			r2d2.setRandomPenColor();
			r2d2.move(100);
			r2d2.turn(90);
		}
		r2d2.turn(90);
		for (int i = 0; i < 4; i++) {
			r2d2.setRandomPenColor();
			r2d2.move(100);
			r2d2.turn(90);
		}
	}
}
