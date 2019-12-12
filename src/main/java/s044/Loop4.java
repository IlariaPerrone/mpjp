package s044;

public class Loop4 {
	public static void main(String[] args) {
		System.out.println(args.length);
		for (String arg : args) {
			System.out.println(arg);
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		int i = 0;
		while (i < args.length) {
			System.out.println(args[i]);
			i++;
		}

	}

}
