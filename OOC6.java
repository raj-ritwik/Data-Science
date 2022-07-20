
public class OOC6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorisedVehicle mo = new MotorisedVehicle();
		mo.checkMotor();
		Car mo1=new Car();
		mo1.drive();
		mo1.turnLeft();
		mo1.brake();
		Train t=new Train();
		t.drive();
		t.turnLeft();
		t.brake();
		

	}

}
interface IVehicle{
	void drive();
	void turnLeft();
	void brake();
}
interface IPublicTransport{
	void getNumberOfPeople();
}

class MotorisedVehicle{
	public void checkMotor() {
		System.out.println("The motor of the vehicle is in good condition");
	}
}
class Car extends MotorisedVehicle implements IVehicle{
	public void drive() {
		System.out.println("The car is in the driving mode");
	}
	public void turnLeft() {
		System.out.println("The car is turning left");
	}
	public void brake() {
		System.out.println("The car is in the brake mode");
	}
}
class Train implements IVehicle, IPublicTransport{
	public void getNumberOfPeople() {
		System.out.println("there are 500 passengers travelling");
	}
	public void drive() {
		System.out.println("The train is in motion");
	}
	public void turnLeft() {
		System.out.println("the train is turning left");
	}
	public void brake() {
		System.out.println("The train is in brake state");
	}
}

interface IAdvancedVehicle extends IVehicle
{
	void accelerate();
}
