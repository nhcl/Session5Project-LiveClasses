package Session5.Project1;

public class fruit {
	
	boolean good = true;
	public fruit() {
		
	}
	
	public fruit(boolean isGood) {
		this.good = isGood;
	}
	
	public void printGood(String howGood) {
		System.out.println(howGood + " " + this.good);
	}
	
	public void printGood() {
		System.out.println(this.good);
	}

}
