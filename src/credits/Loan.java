package credits;

public abstract class Loan {
	
	public Integer id;
	public String bank;
	public Integer term; // срок кредита (в месяцах)
	public Boolean earlyRepayment; //возможность досрочного погашения
	public Boolean creditLineIncrease; //возможность увеличения кредитной линии
	public Loan(Integer id, String bank, Integer term, Boolean earlyRepayment, Boolean creditLineIncrease) {
		super();
		this.id = id;
		this.bank = bank;
		this.term = term;
		this.earlyRepayment = earlyRepayment;
		this.creditLineIncrease = creditLineIncrease;
	}
	@Override
	public String toString() {
		return "id=" + id + ", bank=" + bank + ", term=" + term + ", earlyRepayment=" + earlyRepayment
				+ ", creditLineIncrease=" + creditLineIncrease ;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public Integer getTerm() {
		return term;
	}
	public void setTerm(Integer term) {
		this.term = term;
	}
	public Boolean getEarlyRepayment() {
		return earlyRepayment;
	}
	public void setEarlyRepayment(Boolean earlyRepayment) {
		this.earlyRepayment = earlyRepayment;
	}
	public Boolean getCreditLineIncrease() {
		return creditLineIncrease;
	}
	public void setCreditLineIncrease(Boolean creditLineIncrease) {
		this.creditLineIncrease = creditLineIncrease;
	}







}
