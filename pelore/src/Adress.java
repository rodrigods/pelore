
public class Adress {
	
	private String street, quarter, city, state, country;
	private int number;

	public Adress (String street, String quarter, String city, String state, String country, int number) {
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

	public String getCounttry() {
		return country;
	}

	public void setCounttry(String counttry) {
		this.country = counttry;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
}
