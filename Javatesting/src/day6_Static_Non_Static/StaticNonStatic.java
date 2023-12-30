package day6_Static_Non_Static;

public class StaticNonStatic {
	static int pin = 7896; // Will get override by new value
	int pin1 = 3465;

	public static void main(String[] args) {

		// When trying to create an object
		// One declared static they cannot be called using object reference
		StaticNonStatic sns = new StaticNonStatic();
		System.out.println(sns.pin); // Non STatic calling
		System.out.println(StaticNonStatic.pin);// Static Calling

		StaticNonStatic sns1 = new StaticNonStatic();

		sns1.pin1 = 1111;

		System.out.println("SNS1 Object reference -->" + sns1.pin1);// 1111

		StaticNonStatic sns2 = new StaticNonStatic();

		System.out.println("SNS2 Object reference -->" + sns2.pin1);// 3465

		System.out.println(sns1.pin);

		System.out.println(StaticNonStatic.pin);

		// If any variable or method declared as static then its
		// object cannot be created or you can say its xerox cannot be created

		StaticNonStatic.pin = 0000;

		sns1.call();
		StaticNonStatic.call();
	}

	public static void call() {
		called();
	}

	public static void called() {
		calling();
	}

	public void calling() {
		called();
	}

	public void caller() {
		calling();
	}

}


