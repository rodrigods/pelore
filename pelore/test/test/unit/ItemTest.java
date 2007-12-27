package test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.Item;
import pelore.ItemType;

public class ItemTest {

	ItemType book;
	ItemType car;
	
	Item peterpan;
	Item viper;
	
	@Before
	public void setUp() throws Exception {
		book = new ItemType("book");
		car = new ItemType("car");
		peterpan = new Item("peter pan", book);
		viper = new Item("Viper", car);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testItem() {
		assertEquals("peter pan", peterpan.getName());
		assertEquals("Viper", viper.getName());
		
		assertEquals(book, peterpan.getType());
		assertEquals(car, viper.getType());
	}

	@Test
	public void testIsLended() {
		assertFalse(peterpan.isLended());
		peterpan.setLended(true);
		assertTrue(peterpan.isLended());
	}

	@Test
	public void testSetName() {
		assertEquals("peter pan", peterpan.getName());
		peterpan.setName("peterpan");
		assertEquals("peterpan", peterpan.getName());
	}

	@Test
	public void testSetType() {
		assertEquals(book, peterpan.getType());
		peterpan.setType(car);
		assertEquals(car, peterpan.getType());
	}

	@Test
	public void testEqualsObject() {
		assertFalse(peterpan.equals(viper));
		peterpan.setName(viper.getName());
		assertFalse(peterpan.equals(viper));
		peterpan.setType(viper.getType());
		assertEquals(peterpan, viper);
	}

	@Test
	public void testToString() {
		assertEquals("peter pan", peterpan.toString());
		assertEquals("Viper", viper.toString());
	}

}
