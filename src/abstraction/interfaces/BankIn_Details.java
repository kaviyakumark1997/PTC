package abstraction.interfaces;

public class BankIn_Details implements BankIn, C, D {

	@Override
	public void homeLoan() {
	}

	@Override
	public void educationalLoan() {
	}

	@Override
	public void personalLoan() {
	}
	
	public static void main(String[] args) {
		BankIn_Details b=new BankIn_Details();
		b.personalLoan();
		b.educationalLoan();
		b.homeLoan();
	}

}
