package credits;

public class Individuals extends Loan{
	private Boolean consumerLoans; //класс кредитов для физлиц (добавлено поле - потребительские кредиты)
	
	

	public Individuals(Integer id, String bank, Integer term, Boolean earlyRepayment, Boolean creditLineIncrease, Boolean consumerLoans) {
		super(id, bank, term, earlyRepayment, creditLineIncrease);
		this.consumerLoans=consumerLoans;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+ ", consumerLoans=" + consumerLoans;
	}


	public Boolean getConsumerLoans() {
		return consumerLoans;
	}
	public void setConsumerLoans(Boolean consumerLoans) {
		this.consumerLoans = consumerLoans;
	}
	



}
