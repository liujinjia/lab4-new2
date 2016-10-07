/**
 * 4. Design and implement a class called Car. 
	You need to create necessary attributes for this class, and method if needed
	Define the Car constructor to initialize these values (in that order). 
	Include getter and setter methods for all instance data.
 * @author liujinjia
 *
 */
public class Car {
	private String carName;
	private String carLicense;
	private int lengthOfDrive;
	
	public String getCarName(){
		return carName;
	}
	public void setCarName(String carName){
		this.carName = carName;
	}
	
	public String getCarLicense(){
		return carLicense;
	}
	public void setCarLicense(String carLicense){
		this.carLicense = carLicense;
	}
	
	public int getLengthOfDrive(){
		return lengthOfDrive;
	}
	public void setLengthOfDrive(int lengthOfDrive){
		this.lengthOfDrive = lengthOfDrive;
	}
	
	public Car(String carName, String carLicense, int lengthOfDrive){
		this.carName  = carName;
		this.carLicense = carLicense;
		this.lengthOfDrive = lengthOfDrive;
	}
	public void driveCar(int length){
		lengthOfDrive = lengthOfDrive + length;
	}
	public static void main(String[] args){
		Car car = new Car("Benz", "oz323", 32);
		car.setCarName("to");
		System.out.println(car.carName);
	}
	
	

}
