package Session5.Project1;

public class Cars {
	boolean electric = false; 
	int age;
	boolean isNew = false;
	String vin;
	
	public Cars(String vin) {
		this.vin = vin;
	}
	
	public boolean isElectric() {
		return this.electric;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public boolean isNew() {
		return this.isNew;
	}
}
