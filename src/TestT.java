import junit.framework.TestCase;

/**
 * En esta clase se realiza una prueba unitaria del metodo Taman
 */

/**
 * @author gustavo
 *
 */
public class TestT extends TestCase{
	private Taman t;
	public void init() {
		t = new Taman();
	}
	
	public void testtaman() {
		init();
		String b = "Hola";
		assertEquals(b.length(), 4);
	}
}
