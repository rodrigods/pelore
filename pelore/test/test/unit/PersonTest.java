package test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.Address;
import pelore.Person;
import pelore.PhoneNumber;

public class PersonTest {

	Person p;
	Person personWithAddress;
	
	Address address;
	
	PhoneNumber phone;
	PhoneNumber phone2;
	PhoneNumber phone3;
	
	
	@Before
	public void setUp() throws Exception {
		p = new Person("Joao da Silva");
		address = new Address("street", "quarter", "city", "state", "country", 1);
		personWithAddress = new Person("Jose da Silva", address);
		
		phone = new PhoneNumber(55, 83, 1234, 5678);
		phone2 = new PhoneNumber(55, 81, 2345, 5678);
		phone3 = new PhoneNumber(55, 85, 3456, 5678);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersonString() {
		assertEquals("Joao da Silva", p.getName());
	}

	@Test
	public void testPersonStringAddress() {
		assertEquals("Jose da Silva", personWithAddress.getName());
		assertEquals(address, personWithAddress.getAddress());
	}
	
	@Test
	public void testPersonCopy() {
		Person p = new Person(personWithAddress);
		assertEquals(personWithAddress, p);
	}

	@Test
	public void testPhoneNumber() {
		List<PhoneNumber> list = new LinkedList<PhoneNumber>();
		assertTrue(p.getPhoneNumbers().isEmpty());
		p.addPhoneNumber(phone);
		list.add(phone);
		assertTrue(p.getPhoneNumbers().size() == 1);
		assertEquals(list, p.getPhoneNumbers());
		p.addPhoneNumber(phone2, 0);
		list.add(0, phone2);
		assertTrue(p.getPhoneNumbers().size() == 2);
		assertEquals(list, p.getPhoneNumbers());
		
		p.addPhoneNumber(phone3, 1);
		list.add(1, phone3);
		assertEquals(list, p.getPhoneNumbers());
		assertTrue(p.getPhoneNumbers().size() == 3);
		
		p.removePhoneNumber(0);
		list.remove(0);
		assertTrue(p.getPhoneNumbers().size() == 2);
		assertEquals(list, p.getPhoneNumbers());
		
		p.removePhoneNumber(phone);
		list.remove(phone);
		assertTrue(p.getPhoneNumbers().size() == 1);
		assertEquals(list, p.getPhoneNumbers());
		
		p.removePhoneNumber(phone);
		assertTrue(p.getPhoneNumbers().size() == 1);
		assertEquals(list, p.getPhoneNumbers());
		
	}


	@Test
	public void testName() {
		assertEquals("Joao da Silva", p.getName());
		p.setName("Joao da Silva Sauro");
		assertEquals("Joao da Silva Sauro", p.getName());
	}

	@Test
	public void testAddress() {
		assertEquals(address, personWithAddress.getAddress());
		p.setAddress(personWithAddress.getAddress());
		assertEquals(address, p.getAddress());
	}

	@Test
	public void testEquals() {
		assertFalse(p.equals(personWithAddress));
		p.setName(personWithAddress.getName());
		assertEquals(p, personWithAddress);
	}

	@Test
	public void testToString() {
		assertEquals("Joao da Silva", p.toString());
		assertEquals("Jose da Silva", personWithAddress.toString());
	}

}
