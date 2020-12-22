package Session5.Project1;

public class Toyota extends Cars {
	
	public Toyota(String vin) {
		super(vin);
		electric = false;
	}

	String model = "Toyota";
	
	public String getModel() {
		return this.model;
	}


}
