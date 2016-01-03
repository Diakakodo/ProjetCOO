package fr.uvsq.coo.ex3_5;

public abstract class Robot {
	public abstract void avance();
}

//1. Cette solution ne respecte pas LSP, car RobotStatique ne respecte plus la sémantique de sa super class Robot
