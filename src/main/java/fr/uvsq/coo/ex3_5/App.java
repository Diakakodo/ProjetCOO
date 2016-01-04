package fr.uvsq.coo.ex3_5;

import java.util.ArrayList;
import java.util.Iterator;

public class App {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Robot> listeRobot = new ArrayList<Robot>();
		listeRobot.add(new RobotMobile());
		listeRobot.add(new RobotStatique());
		
		for(Robot robot : listeRobot) {
		       robot.avance();
		}
	}
}
