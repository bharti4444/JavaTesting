package day12_Overriding;

public class TestClass {

public static void main(String[] args) {
		
		RBI rbi = new RBI();
		
		System.out.println(rbi.getHomeLoanROI());//4.5
		
		SBI sbi = new SBI();		
		
		System.out.println(sbi.getHomeLoanROI());//6.5

		RBI rbisbi= new SBI();
		
		System.out.println(rbisbi.getHomeLoanROI());//6.5
		System.out.println(rbisbi.getvehicleROI());//6.5

		//rbisbi.getGoldLoanROI();
		System.out.println(rbisbi.getMarriageLoan());//


	}

}

