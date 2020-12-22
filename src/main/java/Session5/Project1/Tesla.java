package Session5.Project1;

public class Tesla extends Cars {
	
	public Tesla(String vin){
		super(vin);
		electric = true;
	}
	
	String model = "Tesla";
	
	public String getModel() {
		return this.model;
	}

}
