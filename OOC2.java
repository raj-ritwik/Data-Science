import java.util.Scanner;

public class OOC2 {
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a choice of vehicle: \n\t1. Two Wheeler \n\t2.Four Wheeler");

		int n=sc.nextInt(); 
		
		System.out.print ("Vehicle Make type: ");

		String make=sc.next();

		System.out.print ("Vehicle Number: ");

		String vehicleNumber=sc.next(); System.out.print("Fuel Type: ");

		String fuelType=sc.next();

		System.out.print("Fuel Capacity: "); 
		int fuelCapacity=sc.nextInt();

		System.out.print("co: "); 
		int cc=sc.nextInt();

		switch(n)
		{
		case 1:

			System.out.print("Kickstart availability : ");

			System.out.println("Enter true for yes and false for no"); 
			boolean kickStartAvailable=sc.nextBoolean();
			TwoWheeler obj=new TwoWheeler (make, vehicleNumber, fuelType, fuelCapacity, cc, kickStartAvailable);

			obj.displayBasicInfo();

			obj.displayDetailInfo();

			break;

			case 2:

			System.out.print ("Audio system: ");

			String audioSystem=sc.next();

			System.out.print("Doors in the vehicle: ");

			int numberOfDoors=sc.nextInt();

			FourWheeler f4=new FourWheeler (make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);

			f4.displayBasicInfo();

			f4.displayDetailInfo();

			break;

			}

			sc.close();
		}


}
class Vehicle{
	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected int cc;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	public Vehicle(String make, String vehicleNumber,String fuelType,int fuelCapacity,int cc) {
		this.make=make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
	}
	
	public void displayMake() {
		System.out.println("Making type :"+make);
		
	}
	public void displayBasicInfo() {
		System.out.println("Vehicle Number"+vehicleNumber);
		System.out.println("FuelType:"+fuelType);
		System.out.println("Capacity:"+fuelCapacity);
		System.out.println("CC:"+cc);
	}
	public void dispalyDetailInfo()
	{
		
	}
}
	
	class TwoWheeler extends Vehicle{
		boolean kickStartAvailable;

		public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) 
		{
			super(make, vehicleNumber, fuelType, fuelCapacity, cc);
			// TODO Auto-generated constructor stub
			this.kickStartAvailable=kickStartAvailable;
		}
		public void displayDetailInfo() {
			boolean x=true;
			if(kickStartAvailable==x)
			{
				System.out.println("Kick Start : Yes available");
			}
			else {
				System.out.println("Kick Start : Not available");
			}
		}
		
	}


class FourWheeler extends Vehicle{
	String audioSystem;
	int numberOfDoors;

	public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc, String audioSysytem,int numberOfDoors) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		// TODO Auto-generated constructor stub
		this.audioSystem=audioSystem;
		this.numberOfDoors=numberOfDoors;
		
	}

	public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	
	public void displayDetailInfo()
	{
		System.out.println("Audio System:"+audioSystem);
		System.out.println("Number Of Doors:"+numberOfDoors);
	}
	
}

