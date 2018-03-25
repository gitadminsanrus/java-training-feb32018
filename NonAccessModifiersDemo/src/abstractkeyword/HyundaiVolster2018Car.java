package abstractkeyword;

public class HyundaiVolster2018Car extends HyundaiVolsterCar {
	
	public HyundaiVolster2018Car(String modelNumber) {
		super(modelNumber);
	}
	
	void accelerate(int speed)
	{
		System.out.println("2018 Model - Tweaked in engine performance");
		
		super.accelerate(speed);
	}

}
