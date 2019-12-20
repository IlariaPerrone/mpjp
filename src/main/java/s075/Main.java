package s075;

public class Main {
	public static void main(String[] args) {
		Poodle poodle = new Poodle("Jim");
		Poodle p2 = new Poodle();

		System.out.println(poodle);
		System.out.println(p2);

		Poodle p3 = new Poodle("Pallino", 15, 30);
		System.out.println(p3);

		Dog dog = new Dog("Ettore", 18);
		System.out.println(dog);
	}
}
