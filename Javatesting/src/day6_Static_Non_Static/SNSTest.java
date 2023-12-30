package day6_Static_Non_Static;

public class SNSTest {

	public static void droped() {
		StaticNonStatic.call();
		StaticNonStatic sns = new StaticNonStatic();
		sns.calling();
	}

	public void drop() {
		
		StaticNonStatic sns = new StaticNonStatic();
		sns.call();
		sns.calling();
		StaticNonStatic.call();
	}
}

