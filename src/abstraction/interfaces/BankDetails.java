package abstraction.interfaces;

public class BankDetails extends Bank{

	@Override
	public void personalLoan() {
		System.out.println("14%");
	}
	
	public static void main(String[] args) {
		BankDetails b=new BankDetails();
		b.personalLoan();
		b.educationalLoan();
		b.homeLoan();
	}

}
