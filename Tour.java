package Travel;

public class Tour {
	private String package_id;
	private String source;
	private String destination;
	private int noOfDays;
	private double basic_fare;
	private double package_cost;
	
	public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public double getBasic_fare() {
		return basic_fare;
	}

	public void setBasic_fare(double basic_fare) {
		this.basic_fare = basic_fare;
	}

	public double getPackage_cost() {
		return package_cost;
	}

	public void setPackage_cost(double package_cost) {
		this.package_cost = package_cost;
	}

	public double packagecost() {
		double disc=0;
		if(noOfDays<=5)
		{
			disc=0;
		}
		else if((noOfDays>5)&&(noOfDays<=8)) {
			disc=0.03;
		}
		else if((noOfDays>8)&&(noOfDays<=10.5)) {
			disc=0.05;
		}
		else {
			disc=0.07;
		}
		disc=((basic_fare*noOfDays)*disc);
		double gst=disc*0.12;
		this.package_cost=disc+gst;
		return (int) package_cost;
	}

}