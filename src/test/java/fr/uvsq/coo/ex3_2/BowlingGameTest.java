package fr.uvsq.coo.ex3_2;

import junit.framework.TestCase;

public class BowlingGameTest extends TestCase {
	
	private Game g;
	
	protected void setUp() throws Exception {
	g = new Game();
	}

	public void testGutterGame() throws Exception {
		rollMany(20, 0);
		assertEquals(0, g.score());
	}
	
	private void rollMany(int n, int pins) {
		for (int i = 0; i < n; i++)
		g.roll(pins);
		}
	
	public void testAllOnes() throws Exception {
		for (int i = 0; i < 20; i++)
		g.roll(1);
		assertEquals(20, g.score());
	}

}
