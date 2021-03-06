package cse360assign3;

/**
 * This class contains methods which operate as a calculator
 * 
 * @author Tariq Bayounis
 * @PIN #118
 * 
 */

public class Calculator {

	private int total;
	private String history = "0";
	
	/**
	 * the constructor sets the total to zero
	 */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * this method returns the total
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * this method adds a value to the total
	 * 
	 * @param value - value to be added
	 */
	
	public void add (int value) {
		total += value;	
		history += " + " + value;
	}
	
	/**
	 * this method subtracts a value to the total
	 * 
	 * @param value - value to be subtracted
	 */
	
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * this method multiplies a value by the total
	 * 
	 * @param value - value to multiply by
	 */
	
	public void multiply (int value) {
		total = total  * value;
		history += " * " + value;
	}
	
	/**
	 * this method divides the total by the given value
	 * 
	 * @param value - value to divide by
	 */
	
	public void divide (int value) {
		if(value == 0)
			total = 0;
		
		else
			total = total / value;
		
		history += " / " + value;
	}
	
	public String getHistory () {
		return history;
	}
}
