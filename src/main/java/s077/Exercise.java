package s077;

public class Exercise {
	public static void main(String[] args) {
		Pet[] pets = { new Dog("Fido"), new Dog("Poldo"), new Dog("Bobby"), new Cat("Micia"), new Cat("Neve"),
				new Cat("Luna"), new Pet("Cocorito") };

		for (Pet cur : pets) {
			if (cur instanceof Dog) {
				Dog now = (Dog) cur; // ((Dog) cur).bark();
				now.bark();
			} else if (cur instanceof Cat) {
				Cat now = (Cat) cur; // ((Cat) cur).meow();
				now.meow();
			} else {
				System.out.println("unknown pet");
			}
		}

	}
}
