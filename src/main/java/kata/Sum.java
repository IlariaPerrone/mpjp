package kata;

public class Sum {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum1 = sum1 + arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			sum2 = sum2 + arr2[i];
		}
		return sum1 + sum2;
	}
}
