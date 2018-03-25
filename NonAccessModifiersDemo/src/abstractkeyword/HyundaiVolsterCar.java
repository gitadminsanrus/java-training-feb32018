package abstractkeyword;

public abstract class HyundaiVolsterCar extends HyundaiCar {
	
	public HyundaiVolsterCar(String modelNumber) {
		super(modelNumber);
	}
	
	void accelerate(int speed)
	{
		System.out.println("Zooms fast");
	}
	
	//overridden method from HyundaiCar
	void steerLeft() {
		
		System.out.println("Power sports steering applied for Hyundai volster models");

		//let normal steer left be implemented
		super.steerLeft();
	}

	void steerRight() {
		System.out.println("Turns Right");
	}

}
