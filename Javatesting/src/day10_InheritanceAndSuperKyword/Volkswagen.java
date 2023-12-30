package day10_InheritanceAndSuperKyword;

public class Volkswagen extends Car{

	public static void main(String[] args) {
		Volkswagen vw= new Volkswagen();
		
		vw.getRearWindow();
		
		vw.getColor();
		vw.getWindScreen();
		getTyre();
		
		
		Car cr = new Volkswagen();
		cr.getColor();
		cr.getWindScreen();
		cr.getRearWindow();
		

	}

	
	public void getRearWindow() {}
}

