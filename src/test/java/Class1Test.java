import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class Class1Test {

	@Test
	public void testRnd() {
		assertTrue( Lb5.Class1.rnd() % 1 == 0 && Lb5.Class1.rnd() >= 500 && Lb5.Class1.rnd() <= 700);
		//fail("Not yet implemented");
	}

}
