package abstractkeyword;

public abstract class HyundaiCar extends Car {
	
	public HyundaiCar(String modelNumber) {
		super(modelNumber);
	}

	void stop() {
		System.out.println("Hyundai car way of stopping.");
	}

	void steerLeft() {
		System.out.println("Turns left");
	}

	void steerRight() {
		System.out.println("Turns Right");
	}

	void startEngine() {
		
	}


}
