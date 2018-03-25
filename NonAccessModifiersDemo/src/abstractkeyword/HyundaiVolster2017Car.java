package abstractkeyword;

public class HyundaiVolster2017Car extends HyundaiVolsterCar {
	
	public HyundaiVolster2017Car(String modelNumber) {
		super(modelNumber);
	}
	
	void accelerate(int speed)
	{
		System.out.println("2017 Model - Tweaked in engine fuel injection");
		
		super.accelerate(speed);
	}
	
	//overridden method from HyundaiCar
		void steerLeft() {
			
			System.out.println("Power sports steering enhanced for 2017 models.");

			//let normal steer left be implemented
			super.steerLeft();
		}

}
