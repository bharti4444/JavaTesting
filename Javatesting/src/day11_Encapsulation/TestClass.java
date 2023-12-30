package day11_Encapsulation;

public class TestClass {

	public static void main(String[] args) {
		HDFCBank atm= new HDFCBank();		
		
		//atm.cashWithdrawal(785412, 1470, 2500000);
		
		//atm.pinNo=1574;
		
		atm.cashWithdrawal(785412, 1574, 2500000);
		atm.updatePin(785412, 1470,7852);
		atm.cashWithdrawal(785412, 1574, 2500000);		
		atm.cashWithdrawal(785412, 7852, 2500000);
		
		System.out.println(atm.getCardNo());
		System.out.println(atm.getAvailableBalance());
		
	}
	
	
	

}
