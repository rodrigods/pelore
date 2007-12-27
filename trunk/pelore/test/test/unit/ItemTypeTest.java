package test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.ItemType;

public class ItemTypeTest {

	ItemType book;
	ItemType car;
	ItemType toy;
	
	@Before
	public void setUp() throws Exception {
		book = new ItemType("book");
		car = new ItemType("car");
		toy = new ItemType("toy");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testItemType() {
		assertEquals("book", book.getName());
		assertEquals("car", car.getName());
		assertEquals("toy", toy.getName());
	}

	@Test
	public void testEqualsObject() {
		ItemType book2 = new ItemType("book");
		assertEquals(book, book2);
		assertFalse(book.equals(car));
	}

	@Test
	public void testToString() {
		assertEquals("book", book.toString());
		assertEquals("car", car.toString());
		assertEquals("toy", toy.toString());
	}

}
