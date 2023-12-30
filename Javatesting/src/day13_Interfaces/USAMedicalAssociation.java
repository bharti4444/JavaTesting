package day13_Interfaces;

public interface USAMedicalAssociation  extends WHO{
	int minimumFees = 200;

	public void Jaundice();
	
	public void Alzeimer();

	public void Parkinsons();

	public void Cancer();

	public void Ortho(String country);

	// 14
	// public static void Jaundice();

	public static void Typhoid() {
		
	}

    default void Dengue() {
		
	}

}


