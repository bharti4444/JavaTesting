package day5_Access_Modifiers_Part2;

import day5_Access_Modifiers_Part1.MemberLevelAccessModifier;
import day5_Access_Modifiers_part1.ClassLevelAccessModifierDefault;
import day5_Access_Modifiers_part1.ClassLevelAccessModifierPublic;

public class TestClass {
	public static void main(String[] args) {

		ClassLevelAccessModifierPublic pubblic = new ClassLevelAccessModifierPublic();
		ClassLevelAccessModifierDefault deffault = new ClassLevelAccessModifierDefault();

		MemberLevelAccessModifier obj = new MemberLevelAccessModifier();

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
