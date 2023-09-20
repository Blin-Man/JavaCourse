package day7;

public class Car {
	
	private String brand;
	private String model;
	private int horsepower;
	
	public Car() {
		System.out.println("No input");
	}
	 public Car(String brandcar, String modelcar) {
		 this.brand =brandcar;
		this.model =modelcar;
		
	 }
	
	public Car(String brandcar, String modelcar, int hp) {
		this.brand =brandcar;
		this.model =modelcar;
		this.horsepower = hp;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	@Override
	public String toString() {
		if(horsepower<=0)
			return String.format("%s %s ", this.brand,this.model);
		else
			return String.format("%s %s %d", this.brand,this.model,this.horsepower);
	}
	
		
	

}
