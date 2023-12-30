package day13_Interfaces;

public class TestClass {

public static void main(String[] args) {
		
		//USAMedicalAssociation usa= new USAMedicalAssociation();//8th point
		
		// 9th point
		//By creating an object of child class I can access all overridden and non overridden methods
		
		SevenStarHospital s7s=new SevenStarHospital();
		
		
		
		// top casting
		USAMedicalAssociation usama= new SevenStarHospital();
		UKMedicalAssociation ukma= new SevenStarHospital();
		IndianMedicalAssociation inma= new SevenStarHospital();
		
		
		usama.Alzeimer();
		usama.Cancer();
		usama.Parkinsons();
		usama.Ortho("USA");
		
		ukma.Neurology();
		ukma.Dental();
		ukma.Nephrology();
		ukma.Ortho("UK");
		
		/*ukma.Cardiology();
		usama.Cardiology();
		inma.Cardiology();*/
		
		// DOwncasting
		SevenStarHospital s7s= new USAMedicalAssociation();
		
		//USAMedicalAssociation.minimumFees=90;
		//usama.minimumFees
		//17
		System.out.println(usama.minimumFees);
		
		
		// 18 and 19		
		
		USAMedicalAssociation.Typhoid();
		usama.Dengue();
		
		
		
	}

}

