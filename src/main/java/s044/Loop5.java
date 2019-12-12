package s044;

public class Loop5 {
	public static void main(String[] args) {
		int[] array = { 5, 7, 1, 3, 4 };
		int onePos = -1;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				onePos = i;
				break; 
				
			}
		}

		int sevenPos = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 7) {
				sevenPos = i;
			}
		}

		System.out.println("1 is in position " + onePos);
		System.out.println("7 is in position " + sevenPos);

	}

}
