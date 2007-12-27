package test.unit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.Util;

public class UtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEqualObjects() {
		assertTrue(Util.equalObjects(null, null));
		assertFalse(Util.equalObjects("a", null));
		assertFalse(Util.equalObjects(null, "b"));
		assertTrue(Util.equalObjects("a", "a"));
	}

}
