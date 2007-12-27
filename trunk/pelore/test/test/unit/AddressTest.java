package test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.Address;

public class AddressTest {

	Address address1, address2;
	
	@Before
	public void setUp() throws Exception {
		address1 = new Address("street", "quarter", "city", "state", "country", 1);
		address2 = new Address("street", "quarter", "city", "state", "country", 1, "1a");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddress() {
		assertEquals("street", address1.getStreet());
		assertEquals("quarter", address1.getQuarter());
		assertEquals("city", address1.getCity());
		assertEquals("state", address1.getState());
		assertEquals("country", address1.getCountry());
		assertEquals(1, address1.getNumber());
		assertEquals("1a", address2.getApNumber());
	}

	@Test
	public void testSetStreet() {
		assertEquals("street", address1.getStreet());
		address1.setStreet("street2");
		assertEquals("street2", address1.getStreet());
	}

	@Test
	public void testSetQuarter() {
		assertEquals("quarter", address1.getQuarter());
		address1.setQuarter("quarter2");
		assertEquals("quarter2", address1.getQuarter());
	}

	@Test
	public void testSetCity() {
		assertEquals("city", address1.getCity());
		address1.setCity("city2");
		assertEquals("city2", address1.getCity());
	}

	@Test
	public void testSetState() {
		assertEquals("state", address1.getState());
		address1.setState("state2");
		assertEquals("state2", address1.getState());
	}

	@Test
	public void testSetCountry() {
		assertEquals("country", address1.getCountry());
		address1.setCountry("country2");
		assertEquals("country2", address1.getCountry());
	}

	@Test
	public void testSetNumber() {
		assertEquals(1, address1.getNumber());
		address1.setNumber(2);
		assertEquals(2, address1.getNumber());
	}
	
	public void testSetApNumber() {
		assertEquals("1a", address2.getApNumber());
		address2.setApNumber("2b");
		assertEquals("2b", address2.getApNumber());
	}

	@Test
	public void testEquals() {
		Address address3 = new Address("street", "quarter", "city", "state", "country", 1, "");
		assertEquals(address1, address3);
		address3 = new Address("street2", "quarter", "city", "state", "country", 1);
		assertFalse(address1.equals(address3));
		address3 = new Address("street", "quarter2", "city", "state", "country", 1);
		assertFalse(address1.equals(address3));
		address3 = new Address("street", "quarter", "city2", "state", "country", 1);
		assertFalse(address1.equals(address3));
		address3 = new Address("street", "quarter", "city", "state2", "country", 1);
		assertFalse(address1.equals(address3));
		address3 = new Address("street", "quarter", "city", "state", "country2", 1);
		assertFalse(address1.equals(address3));
		address3 = new Address("street", "quarter", "city", "state", "country", 12);
		assertFalse(address1.equals(address3));
		address3 = new Address("street", "quarter", "city", "state", "country", 1, "1a");
		assertFalse(address1.equals(address3));
	}

	@Test
	public void testToString() {
		assertEquals("street 1, quarter, city, state, country", address1.toString());
	}

}
