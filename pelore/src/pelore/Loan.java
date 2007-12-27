package pelore;
import java.util.Date;

public abstract class Loan {

	private String comment;
	private Date loanDate;
	private Date devolutionDate;
	
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
