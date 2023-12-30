package day9_ConstructorAndThisKeyword;

public class SBIATM {

	long cardNo;
	int CVV;
	String expiry;
	int pin;
	
	public SBIATM() {

		System.out.println("This is the first non paramterised constructor of SBIATM class");
	}

	public SBIATM(int cardNo) {

		System.out.println("This is the first paramterised constructor of SBIATM class with Card No ->" + cardNo);
	}
	public SBIATM(long cardNo,int CVV,String expiry,int pin) {

		System.out.println( "Card No: " + cardNo + " CVV: " +CVV + " Expiry: " +  expiry +" Pin: " +   pin);
		this.cardNo=cardNo;
		this.CVV=CVV;
		this.expiry=expiry;
		this.pin=pin;	
		
	}
	
}
