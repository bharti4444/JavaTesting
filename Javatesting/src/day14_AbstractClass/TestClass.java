package day14_AbstractClass;

public class TestClass {
	public static void main(String[] args) {

		// BankOfAmerica bofa= new BankOfAmerica();

		// USTReasury ust= new USTReasury();

		BankOfNewYork bny = new BankOfNewYork();

		// Variable declared in abstract class
		System.out.println(bny.minFees);
		bny.minFees = 990;
		// Variable declared in Interface
		System.out.println(bny.minBal);
		bny.minBal = 990;

	}
}
