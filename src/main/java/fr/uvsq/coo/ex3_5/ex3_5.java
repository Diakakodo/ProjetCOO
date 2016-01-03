package fr.uvsq.coo.ex3_5;

import java.util.ArrayList;
import java.util.Iterator;

public class ex3_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Robot> listeRobot = new ArrayList<Robot>();
		listeRobot.add(new Robot());
		listeRobot.add(new RobotStatique());
	}
	
	public void avanceTous(ArrayList listeRobot){
		Iterator<Robot> it = listeRobot.iterator();
		while (it.hasNext()) {
		       (it.next()).avance();
		}
	}

}
