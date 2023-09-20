package day7;

public class BankAccount {
	private static final double DEFAULT_INTEREST = 0.15;
	private static int accid=0;
	private static double deposit;
	private static double interest = DEFAULT_INTEREST;
	
	BankAccount(){
		 accid += 1;
		deposit =0;
		interest = DEFAULT_INTEREST;
	}

	public static int getAccid() {
		return accid;
	}

	public static void setAccid(int accid) {
		BankAccount.accid = accid;
	}

	public static double getDeposit() {
		return deposit;
	}

	public static void setDeposit(double deposit) {
		BankAccount.deposit = deposit;
	}

	public static double getInterest() {
		return interest;
	}

	public static void setInterest(double interest) {
		BankAccount.interest = interest;
	}

	public static double getDefaultInterest() {
		return DEFAULT_INTEREST;
	}

	
	
}
