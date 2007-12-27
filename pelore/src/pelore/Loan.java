package pelore;
import java.util.Date;

//TODO - add closeLoan method (and a variable to the loan date finishing)

public abstract class Loan {

	private String comment;
	private Date loanDate;
	private Date devolutionDate;
	
	public Loan() {
		this(null, null, null);
	}
	
	public Loan(String comment) {
		this(comment, null, null);
	}
	
	public Loan(String comment, Date devolutionDate) {
		this(comment, null, devolutionDate);
	}
	
	public Loan(Date loanDate, Date devolutionDate) {
		this(null, loanDate, devolutionDate);
	}
	
	public Loan(String comment, Date loanDate, Date devolutionDate) {
		this.comment = comment;
		this.loanDate = loanDate;
		this.devolutionDate = devolutionDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public Date getDevolutionDate() {
		return devolutionDate;
	}

	public void setDevolutionDate(Date devolutionDate) {
		this.devolutionDate = devolutionDate;
	}
	
}
