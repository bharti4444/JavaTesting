package day5_Access_Modifiers_part1;

public class MemberLevelAccessModifier {
	private int i = 12;
	public int j = 14;
	int k = 16;
	protected int u = 18;

	public boolean getPublicMethod() {
		return false;
	}

	private boolean getPrivateMethod() {
		return false;
	}

	protected boolean getProtectedMethod() {
		return false;
	}

	boolean getDefaultMethod() {
		return false;
	}

	
	public static void main(String[] args) {
		MemberLevelAccessModifier obj= new MemberLevelAccessModifier();
		
		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.u);
		
		System.out.println(obj.getPrivateMethod());
		System.out.println(obj.getPublicMethod());
		System.out.println(obj.getDefaultMethod());
		System.out.println(obj.getProtectedMethod());
	}
	
	
}


