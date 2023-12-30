package day9_ConstructorAndThisKeyword;

public class TestClass {

	public static void main(String[] args) {

		/*
		 * SBIATM sbi1= new SBIATM();
		 * 
		 * SBIATM sbi2= new SBIATM(9876);
		 */

		SBIATM sbi3 = new SBIATM(9876125478549632l, 159, "06/30", 7865);

		System.out.println(sbi3.cardNo);
		System.out.println(sbi3.CVV);
		System.out.println(sbi3.expiry);
		System.out.println(sbi3.pin);

	}

}

