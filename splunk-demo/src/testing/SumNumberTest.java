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
public class SumNumberTest {

	@Test
	public void test() {
		Maths maths = new Maths();
		int output = maths.sumNumber(2, 3);
		assertEquals(5, output);
	}

}
