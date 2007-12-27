
public class Phone {
	
	private int prefix;
	private int sufix;
	private int zoneCode;
	private int countryCode;
	
	public Phone(int countryCode, int zoneCode, int prefix, int sufix) {
		this.prefix = prefix;
		this.sufix = sufix;
		this.zoneCode = zoneCode;
		this.countryCode = countryCode;
	}

	public int getPrefix() {
		return prefix;
	}

	public void setPrefix(int prefix) {
		this.prefix = prefix;
	}

	public int getSufix() {
		return sufix;
	}

	public void setSufix(int sufix) {
		this.sufix = sufix;
	}

	public int getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(int zoneCode) {
		this.zoneCode = zoneCode;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	
	public String toString() {
		return countryCode + " " + zoneCode + " " + prefix + "-" + sufix;
	}

}
