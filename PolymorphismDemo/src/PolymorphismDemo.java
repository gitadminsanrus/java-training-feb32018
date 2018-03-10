
public class PolymorphismDemo {

	public static void main(String[] args) {
		
		System.out.println("-----ANIMAL--------");
		Animal animal = new Animal();
		animal.eat();
		animal.move();
		animal.sleep();
		
		System.out.println("\n-----DOG--------");
		animal = new Dog();
		animal.sleep();
		animal.eat();
		animal.move();
		
		System.out.println("\n-----CAT--------");
		animal = new Cat();
		animal.sleep();
		animal.eat();
		animal.move();
		
		int[] scores = new int[3];
		scores[0] = 10;
		scores[1] = 20;
		scores[2] = 30;
		
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Cat();
		
		for (int index = 0; index < animals.length; index++) {
			Animal r = animals[index];
			r.eat();
		}
		

	}

}
