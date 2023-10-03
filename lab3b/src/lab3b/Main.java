package lab3b;

interface Vehicle{
	public void run();
	public void breaks();
}

abstract class VehicleImpl implements Vehicle{
	public abstract void run();
	

}

class Car extends VehicleImpl{
	public void run() {
		System.out.println("Car is being Driven");
	}
	public void breaks() {
		System.out.println("Breaking");
	}
}

class MoterCycle extends VehicleImpl{
	public void run() {
		System.out.println("MoterCycle is being Ridden");
	}
	public void breaks() {
		System.out.println("Breaking");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleImpl aTestVehicle = new Car();
		aTestVehicle.run();
		aTestVehicle = new MoterCycle();
		aTestVehicle.run();
		//create your own project if want, Dont Change in this one !!!!
		
	}

}
