package day4_loops;

public class NestedLoop {
	public static void main(String[] args) {

		int i = 0;

		while (i < 3) {

			for (int j = 0; j < 4; j++) {

				int k = 0;

				do {
					
					System.out.println("i -->" + i + " j -->" + j + "  k -->" + k);
					k++;
				} while (k < 5);

			}
			i++;
		}

	}

}
