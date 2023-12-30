package day14_AbstractClass;

public abstract class BankOfAmerica extends USTReasury{

	int minFees = 900;

	public BankOfAmerica() {
		System.out.println("Constructor of Parent Class");
	}

	public final void communityTax() {

	}

	public void communityTax1() {

	}

	public abstract  void wealthtax();

}

