package pelore;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class MoneyLoan {
	
	private BigDecimal amount;
	
	public MoneyLoan(BigDecimal amount) throws ArithmeticException {
		if (amount.compareTo(BigDecimal.ZERO) > 0) {			
			setAmount(amount);
		} else {
			throw new ArithmeticException();
		}
	}
	
	public MoneyLoan(MoneyLoan ml) throws ArithmeticException {
		this(ml.getAmount());
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	public void sumAmount(BigDecimal bd) {
		amount = amount.add(bd);		
	}

	public void sumAmount(double d) {
		sumAmount(BigDecimal.valueOf(d));		
	}

	public void subtractAmount(BigDecimal bd) throws IllegalArgumentException {
		if (amount.compareTo(bd) > 0) {
			amount = amount.subtract(bd);
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public void subtractAmount(double d) throws IllegalArgumentException {
		subtractAmount(BigDecimal.valueOf(d));
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof MoneyLoan) {
			MoneyLoan other = (MoneyLoan) obj;
			return other.getAmount().equals(this.getAmount());
		}
		return false;
	}
	
	public String toString() {
		String format = String.valueOf(amount);
		if (format.length() >= 6 ) {			
			format = format.substring(0, format.indexOf(".")) + "," + 
			         format.substring(format.indexOf(".") + 1, 6);
		} else {
			format = format.substring(0, format.indexOf(".")) + "," + 
	                 format.substring(format.indexOf(".") + 1, 5) + "0";
		}
		return format;
	}
	
}
