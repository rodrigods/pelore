package test.unit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pelore.Item;
import pelore.ItemType;
import pelore.dao.ItemPK;

public class ItemPKTest {

	ItemType book;
	ItemType car;
	
	Item peterpan;
	Item viper;
	
	ItemPK peterpanPK;
	ItemPK viperPK;
	
	@Before
	public void setUp() throws Exception {
		book = new ItemType("book");
		car = new ItemType("car");
		peterpan = new Item("peter pan", book);
		viper = new Item("Viper", car);
		
		peterpanPK = new ItemPK(peterpan);
		viperPK = new ItemPK(viper);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testItemPKItem() {
		assertEquals("peter pan", peterpanPK.getName());
		assertEquals("Viper", viperPK.getName());
		
		assertEquals(book, peterpanPK.getType());
		assertEquals(car, viperPK.getType());
	}

	@Test
	public void testSetName() {
		assertEquals("peter pan", peterpanPK.getName());
		peterpanPK.setName("peterpan");
		assertEquals("peterpan", peterpanPK.getName());
	}

	@Test
	public void testSetType() {
		assertEquals(book, peterpanPK.getType());
		peterpanPK.setType(car);
		assertEquals(car, peterpanPK.getType());
	}

	@Test
	public void testEqualsObject() {
		assertFalse(peterpanPK.equals(viperPK));
		peterpanPK.setName(viperPK.getName());
		assertFalse(peterpanPK.equals(viperPK));
		peterpanPK.setType(viperPK.getType());
		assertEquals(peterpanPK, viperPK);
	}

	@Test
	public void testToString() {
		assertEquals("peter pan (book)", peterpanPK.toString());
		assertEquals("Viper (car)", viperPK.toString());
	}

}
