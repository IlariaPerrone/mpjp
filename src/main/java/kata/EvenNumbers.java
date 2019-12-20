package kata;

public class EvenNumbers {
	public static int[] divisibleBy(int[] numbers, int divider) {
		int counter = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {
				counter += 1;
			}
		}
		int[] array = new int[counter];
		int pos = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % divider == 0) {

				array[pos] = numbers[i];
				pos++;
			}
		}
		return array;
	}
}
