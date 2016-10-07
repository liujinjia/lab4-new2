/**
 * 3. Write a class named GasTank containing:
	An instance variable named amount of type double, initialized to 0.
	A method named addGas that accepts a parameter of type double . 
	The value of the amount instance variable is increased by the value of the parameter.
	A method named useGas that accepts a parameter of type double . 
	The value of the amount instance variable is decreased by the value of the parameter.
	A method named getGasLevel that accepts no parameters. 
	getGasLevel returns the value of the amount instance variable.
 * @author liujinjia
 *
 */
public class GasTank {
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
	public static void main(String[] args){
		GasTank g = new GasTank();
		g.addGas(20);
		g.useGas(3);
		g.getGasLevel();
	}
	

}
