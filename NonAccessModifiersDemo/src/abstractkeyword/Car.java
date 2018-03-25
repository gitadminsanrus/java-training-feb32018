package abstractkeyword;

public abstract class Car {
	
	protected String modelNumber;
	private static int count;
	
	public Car(String modelNumber) {
		this.modelNumber = modelNumber;
		count++;
	}
	
	abstract void stop();
	abstract void steerLeft();
	abstract void steerRight();
	abstract void accelerate(int speed);
	abstract void startEngine();
	
	//this is not possible, as static methods cannot be overridden
//	public abstract static int getX();
	
	public static int getCarCount() {
		return count;
	}

}
