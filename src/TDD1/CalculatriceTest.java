package TDD1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatriceTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testExecute() {
		Calculatrice cal = new Calculatrice();
		assertEquals("ERREUR DE SAISIE",cal.executemultisansprio(""));
		assertEquals("ERREUR DE SAISIE",cal.executemultisansprio("2"));
		assertEquals("ERREUR DE SAISIE",cal.executemultisansprio("6+"));
		assertEquals("ERREUR DE SAISIE",cal.executemultisansprio("++"));
		assertEquals("ERREUR DE SAISIE",cal.executemultisansprio("a+a"));
		assertEquals("6",cal.executemultisansprio("3+3"));
		assertEquals("0",cal.executemultisansprio("3-3"));
		assertEquals("9",cal.executemultisansprio("3*3"));
		assertEquals("1",cal.executemultisansprio("3/3"));
		assertEquals("9",cal.executemultisansprio("3+3+3"));
		assertEquals("0",cal.executemultisansprio("3+3-6"));
		assertEquals("1",cal.executemultisansprio("3*3/9"));
		assertEquals("5",cal.executemultisansprio("5*5/5-5+5"));
		assertEquals("20",cal.executemultisansprio("10+10"));
	}

}
