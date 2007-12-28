package pelore.dao;

import pelore.Item;
import pelore.ItemType;

public class ItemPK {

	public String name;
	public ItemType type;
	
	public ItemPK(String name, ItemType type) {
		setName(name);
		setType(type);
	}
	
	public ItemPK(Item item) {
		this(item.getName(), item.getType());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public ItemType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ItemType type) {
		this.type = type;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof ItemPK) {
			ItemPK other = (ItemPK) obj;
			return other.getName().equals(this.getName()) &&
					other.getType().equals(this.getType());
		}
		return false;
	}
	
	public String toString() {
		return getName() + " (" + getType() + ")";
	}
}
