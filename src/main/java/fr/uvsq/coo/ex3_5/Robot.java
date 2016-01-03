package fr.uvsq.coo.ex3_5;

class Robot {
	private Position position;
	private Direction direction;
	
	public void tourne() { /* tourne ’1/4 de tour */ }
	public void avance() { /* avance d’une case */ }
}

//1. Cette solution ne respecte pas LSP, car RobotStatique ne respecte plus la sémantique de sa super class Robot
