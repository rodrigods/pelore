package test.unit;

import static org.junit.Assert.assertEquals;
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
		assertEquals("peterpan", peterpan.getName());
		assertEquals("Viper", viper.getName());
		
		assertEquals(book, peterpan.getType());
		assertEquals(car, viper.getType());
	}

	@Test
	public void testIsLended() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetName() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testSetType() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testToString() {
		fail("Not yet implemented"); // TODO
	}

}
