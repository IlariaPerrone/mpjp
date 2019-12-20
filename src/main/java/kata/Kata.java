package kata;

public class Kata {
	static String noSpace(final String x) {
		StringBuilder ns = new StringBuilder();
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) != ' ') {
				ns.append(x.charAt(i));
			}
		}
		return ns.toString();
	}
}
