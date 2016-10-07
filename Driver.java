/**
 * 5. Combine with problem 3 and 4,
	 define a class named Driver that contains methods like drive and addGas 
	 so that the driver can drive the car.
 * @author liujinjia
 *
 */
public class Driver {
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
	

	public void driveCar(int length){
		lengthOfDrive = lengthOfDrive + length;
	}
	int amount = 0;
	public void addGas(int parameter){
		amount = amount + parameter;
	}
	public void useGas(int parameter){
		amount = amount - parameter;
	}
	public int getGasLevel(){
		System.out.println(amount);
		return amount;
	}

}
