import static org.junit.Assert.*;

import org.junit.Test;

import br.utfpr.lista5.Identifier;

import org.junit.Before;

public class IdentifierTestCase {

	public static final int tempLimit = 300;
	private Identifier id;

	@Before
	public void start() {
		id = new Identifier();
	}

	@Test(timeout = tempLimit)
	public void test_1() {
		assertEquals(true, id.validateIdentifier("luiz1"));
	}

	@Test(timeout = tempLimit)
	public void test_2() {
		assertEquals(false, id.validateIdentifier(""));
	}

	@Test
	public void test_3() {
		assertEquals(false, id.validateIdentifier("L142#2"));
	}

	@Test
	public void test_4() {
		assertEquals(false, id.validateIdentifier("8Y5"));
	}

	@Test
	public void test_5() {
		assertEquals(false, id.validateIdentifier("L#!2"));
	}
	@Test
	public void test_6() {
		assertEquals(false, id.validateIdentifier("p1osGraduacao"));
	}	
}
