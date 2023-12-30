package day12_Overriding;

public class SBI extends RBI{

	public double getHomeLoanROI() {

		return 6;
	}

	public void getGoldLoanROI() {

	}

	public SBI getHNIData() {

		SBI r = new SBI();

		return r;
	}

	public Double getEducationLoan() {

		return 9.8;
	}
	
	public PNB getPersonalLoan() {		
		PNB r= new PNB();
		return r;
	}
    public static double getMarriageLoan() {
		
		return 10.15;
	}

}

