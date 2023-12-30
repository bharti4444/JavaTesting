package day8_PolyMorphism_Overloading;

public class BarclaysBank {

	public static void main(String[] args) {
		BarclaysBank bb = new BarclaysBank();

		bb.withdrawalAmount(5, 85, 89);
		
		main(78);

	}

	public static void main(String[] args1, String[] args2) {
		System.out.println("int + int");
	}

	public static void main(int op) {
		System.out.println("int + int");
	}
	

	public void withdrawalAmount(int withdrawAmount, int availabLeAmount, int rem) {
		withdrawalAmount(90.36, 85);
		System.out.println("int + int");
	}

	public void withdrawalAmount(double withdrawAmount, int availabLeAmount) {
		System.out.println("double + int");
	}

	public void withdrawalAmount(int withdrawAmount, double availabLeAmount) {
		System.out.println("int + double");
	}

	public void withdrawalAmount(double withdrawAmount, double availabLeAmount) {
		System.out.println("double + double");
	}

	public int loginAmazon(String UN, String PW) {

		return 5;
	}

	public double loginAmazon(String UN, String PW) {

		return 5.5;
	}
	
	public void loginAmazon(int MobileNo, String PW) {

	}
	public void loginAmazon(long CellNo, String PW) {

	}

}

