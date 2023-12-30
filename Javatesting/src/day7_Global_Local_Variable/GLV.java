package day7_Global_Local_Variable;

public class GLV {
	public static int global = 890;

	public void roi() {

		int local = 90;
		GLV glv = new GLV();
		glv.global = 76;
		GLV.global = 9;
	}

	public static void main(String[] args) {
		GLV glv = new GLV();
		glv.global = 76;
		GLV.global = 9;
		glv.local = 987;
		glv.roi();

	}

}
