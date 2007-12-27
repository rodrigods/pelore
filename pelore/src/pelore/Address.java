package pelore;

//TODO - add complement (for things such like apartments)

public class Address {
	
	private String street, quarter, city, state, country;
	private int number;

	public Address (String street, String quarter, String city, String state, String country, int number) {
		this.street = street;
		this.quarter = quarter;
		this.city = city;
		this.state = state;
		this.country = country;
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString() {
		return getStreet() + " " + getNumber() + ", " + getQuarter() + ", " + getCity() + 
				", " + getState() + ", " + getCountry();
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Address) {
			Address other = (Address) obj;
			return other.getStreet().equals(this.getStreet()) &&
					other.getNumber() == this.getNumber() &&
					other.getQuarter().equals(this.getQuarter()) &&
					other.getCity().equals(this.getCity()) &&
					other.getState().equals(this.getState()) &&
					other.getCountry().equals(this.getCountry());
		}
		return false;
	}
}
