package test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.PhoneNumber;

public class PhoneNumberTest {

	private PhoneNumber pn;
	
	@Before
	public void setUp() throws Exception {
		pn = new PhoneNumber(55, 83, 1234, 5678);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPhoneNumber() {
		PhoneNumber number = new PhoneNumber(55, 83, 1234, 5678);
		assertEquals(55, number.getCountryCode());
		assertEquals(83, number.getZoneCode());
		assertEquals(1234, number.getPrefix());
		assertEquals(5678, number.getSufix());
	}

	@Test
	public void testPrefix() {
		assertEquals(1234, pn.getPrefix());
		pn.setPrefix(2345);
		assertEquals(2345, pn.getPrefix());
		pn.setPrefix(0);
		assertEquals(0, pn.getPrefix());
	}

	@Test
	public void testSufix() {
		assertEquals(5678, pn.getSufix());
		pn.setSufix(2345);
		assertEquals(2345, pn.getSufix());
		pn.setSufix(0);
		assertEquals(0, pn.getSufix());
	}

	@Test
	public void testZoneCode() {
		assertEquals(83, pn.getZoneCode());
		pn.setZoneCode(81);
		assertEquals(81, pn.getZoneCode());
	}

	@Test
	public void testCountryCode() {
		assertEquals(55, pn.getCountryCode());
		pn.setCountryCode(10);
		assertEquals(10, pn.getCountryCode());
	}

	@Test
	public void testToString() {
		assertEquals("(+55 83) 1234-5678", pn.toString());
	}

	@Test
	public void testEquals() {
		PhoneNumber pn2 = new PhoneNumber(55, 83, 1234, 5678);
		assertEquals(pn, pn2);
		PhoneNumber pn3 = new PhoneNumber(11, 83, 1234, 5678);
		assertFalse(pn.equals(pn3));
		pn2 = new PhoneNumber(55, 81, 1234, 5678);
		assertFalse(pn.equals(pn2));
		pn2 = new PhoneNumber(55, 83, 1255, 5678);
		assertFalse(pn.equals(pn2));
		pn2 = new PhoneNumber(55, 83, 1234, 5699);
		assertFalse(pn.equals(pn2));
	}

}
