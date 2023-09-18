package abstraction.interfaces;

public abstract class Bank {
	
	public abstract void personalLoan();
	
	public void educationalLoan() {
		System.out.println("8%");
	}
	
	public void homeLoan() {
		System.out.println("12%");
	}
	
	private void loan() {

	}
	
}
