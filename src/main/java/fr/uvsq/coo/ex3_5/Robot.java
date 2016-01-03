package fr.uvsq.coo.ex3_5;

class Robot {
	private Position position;
	private Direction direction;
	
	public void tourne() { /* tourne ’1/4 de tour */ }
	public void avance() { /* avance d’une case */ }
}

class RobotStatique extends Robot{
@Override
public void avance() { throw new UnsupportedOperationException(); }
}