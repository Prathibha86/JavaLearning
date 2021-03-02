package javalearning;

public class Car {
	
	int nWheels = 4;
	
    float carPrice = 18.60f;
	
	char fuelType = 'p';
	
	boolean isPuncture = false;
	
	String carColor = "Red";
	
	public void driveCar()
	{
		System.out.println("Test");
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();
		obj.driveCar();
		
		System.out.println(obj.carColor);
		System.out.println(obj.carPrice);
		System.out.println(obj.fuelType);
		System.out.println(obj.isPuncture);
		System.out.println(obj.nWheels);

	}

	public void applyBrake() {
		
       System.out.println("Applying Brake");
	}

}
