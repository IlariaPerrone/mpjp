package s044;

public class Compito {
	public static void main(String[] args) {
		int[] array = { 42, 5, 76, 23, 42, 23, 88 };
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println(min);
	}
}
