/**
 * 
 */
package testing;

import static org.junit.Assert.*;

import org.junit.Test;

import utils.Maths;

/**
 * @author mabasit
 *
 */
public class SquareNumberTest {

	@Test
	public void test() {
		Maths maths = new Maths();
		int output = maths.squareNumber(2);
		assertEquals(4, output);
	}

}
