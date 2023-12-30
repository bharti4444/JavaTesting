package day11_Encapsulation;

public class HDFCBank {

	private int cardNo = 785412;
	private int pinNo = 1470;
	private int availableBalance = 2500000;

	
	
	public int getCardNo() {
		return cardNo;
	}

	public int getAvailableBalance() {
		return availableBalance;
	}

	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	
	public void cashWithdrawal(int cardNo, int pinNo, int withdrawal) {

		if (cardNo == this.cardNo && pinNo == this.pinNo) {
			
			if(withdrawal<=this.availableBalance) {
				this.availableBalance=this.availableBalance-withdrawal;
				System.out.println("Successfully withdrawal cash");
				System.out.println("Available Balance: "+this.availableBalance);
				
			}
			else {
				System.out.println("Insuficient funds");
			}

		} else {
			System.out.println("Invalid Credential!!!!!!!");
		}

	}

	public void updatePin(int cardNo, int oldPinNo,int newPin) {		
		
		if (cardNo == this.cardNo && oldPinNo == this.pinNo) {
			
			//this.pinNo=newPin;
			
			setPinNo(newPin);
			
			System.out.println("Pin Changed Succesfully");
			
		}else {
			System.out.println("Invalid Credentials");
		}
		
	}
}

