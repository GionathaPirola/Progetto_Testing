import static org.junit.Assert.*;

import org.junit.Test;

public class testGiocoATGT {

	@Test
	public void test1() {
		int result = 0;
		GiocoATGT g = new GiocoATGT();
		result = g.giocata(3);
		assertEquals(0, result);
		result = g.giocata(4);
		//Controllo che posso continuare a giocare
		assertEquals(0, result);
	}

	@Test
	public void test2() {
		int result = 0;
		GiocoATGT g = new GiocoATGT();
		result = g.giocata(3);
		assertEquals(0, result);
		result = g.giocata(1);
		assertEquals(0, result);
		result = g.giocata(4);
		assertEquals(1, result);
	}
}
