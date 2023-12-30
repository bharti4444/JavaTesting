package day5_Method;

public class ATMWithdrawal {

public static void main(String[] args) {
		
		System.out.println("ATM Machine");		
		ATMWithdrawal atmObj = new ATMWithdrawal();
		System.out.println(atmObj);
		System.out.println(atmObj.verifyCardDetails(123575, 233, "23/01/1995"));
		
		
	}
	
	
	public boolean verifyCardDetails(int cardNo,int cvv,String date) {
		ATMWithdrawal atm = new ATMWithdrawal();
		
		System.out.println("A DB code where with cardNo all details will be fetched");
		int dbCardNo=12355;
		int dbCVV=233;
		String dbDOB="23/01/1995";
		
		if(cardNo==dbCardNo && cvv==dbCVV && date.equals(dbDOB)) {
			System.out.println("Customer verified");
			
			return true;
			
			
			
		} else {
			System.out.println("Invalid Card Details");
			return false;
		}
		
	}
	
	
	
	
}

