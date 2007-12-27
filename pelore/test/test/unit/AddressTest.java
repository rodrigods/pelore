package test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.Address;

public class AddressTest {

	Address address;
	
	@Before
	public void setUp() throws Exception {
		address = new Address("street", "quarter", "city", "state", "country", 1);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddress() {
		assertEquals("street", address.getStreet());
		assertEquals("quarter", address.getQuarter());
		assertEquals("city", address.getCity());
		assertEquals("state", address.getState());
		assertEquals("country", address.getCountry());
		assertEquals(1, address.getNumber());
	}

	@Test
	public void testSetStreet() {
		assertEquals("street", address.getStreet());
		address.setStreet("street2");
		assertEquals("street2", address.getStreet());
	}

	@Test
	public void testSetQuarter() {
		assertEquals("quarter", address.getQuarter());
		address.setQuarter("quarter2");
		assertEquals("quarter2", address.getQuarter());
	}

	@Test
	public void testSetCity() {
		assertEquals("city", address.getCity());
		address.setCity("city2");
		assertEquals("city2", address.getCity());
	}

	@Test
	public void testSetState() {
		assertEquals("state", address.getState());
		address.setState("state2");
		assertEquals("state2", address.getState());
	}

	@Test
	public void testSetCountry() {
		assertEquals("country", address.getCountry());
		address.setCountry("country2");
		assertEquals("country2", address.getCountry());
	}

	@Test
	public void testSetNumber() {
		assertEquals(1, address.getNumber());
		address.setNumber(2);
		assertEquals(2, address.getNumber());
	}

	@Test
	public void testEquals() {
		Address address2 = new Address("street", "quarter", "city", "state", "country", 1);
		assertEquals(address, address2);
		address2 = new Address("street2", "quarter", "city", "state", "country", 1);
		assertFalse(address.equals(address2));
		address2 = new Address("street", "quarter2", "city", "state", "country", 1);
		assertFalse(address.equals(address2));
		address2 = new Address("street", "quarter", "city2", "state", "country", 1);
		assertFalse(address.equals(address2));
		address2 = new Address("street", "quarter", "city", "state2", "country", 1);
		assertFalse(address.equals(address2));
		address2 = new Address("street", "quarter", "city", "state", "country2", 1);
		assertFalse(address.equals(address2));
		address2 = new Address("street", "quarter", "city", "state", "country", 12);
		assertFalse(address.equals(address2));
	}

	@Test
	public void testToString() {
		assertEquals("street 1, quarter, city, state, country", address.toString());
	}

}
