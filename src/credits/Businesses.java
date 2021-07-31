package credits;

public class Businesses extends Loan{
	private Boolean governmentGuarantees; //класс кредитов для юрлиц (добавлено поле - под гарантии государства)
	
	public Businesses(Integer id, String bank, Integer term, Boolean earlyRepayment, Boolean creditLineIncrease, Boolean  governmentGuarantees){
		super(id, bank, term, earlyRepayment, creditLineIncrease);
		this.governmentGuarantees=governmentGuarantees;
	}
	
	
	@Override
	public String toString() {
		return super.toString()+", governmentGuarantees=" + governmentGuarantees;
	}


	public Boolean getGovernmentGuarantees() {
		return governmentGuarantees;
	}
	public void setGovernmentGuarantees(Boolean governmentGuarantees) {
		this.governmentGuarantees = governmentGuarantees;
	}

	
	
}
