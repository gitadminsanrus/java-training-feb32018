
public class AnimalDemo {

	public static void main(String[] args) {
		
		System.out.println("-----ANIMAL--------");
		Animal animal = new Animal();
		animal.eat();
		animal.move();
		animal.sleep();
		
		System.out.println("\n-----DOG--------");
		Dog dog = new Dog();
		dog.sleep();
		dog.eat();
		dog.move();
		
		System.out.println("\n-----CAT--------");
		Cat cat = new Cat();
		cat.sleep();
		cat.eat();
		cat.move();

	}

}
