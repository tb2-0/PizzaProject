//File : thePizza.java from the package edu.colorado.simulations
import java.util.Scanner;

/***************************************************************************
 * A Pizza object allows the user to input which pizza topping and size he/she wants.
 * 
 * @author Tristan Beyer
 *
 *@version Feb 2, 2015
 ***************************************************************************/
public class thePizza {
	 String pepperoni, mushrooms, sausage, onions, toppingString;
	 String small, medium, large, extraLarge, sizeString;
	 int topping, size;
	 double totalCost, theTax, finalCost;
	 
	 /**
	 *Choose a topping and a size for your pizza.
	 *@param topping
	 *   a topping that the user can choose between pepperoni, sausage, onions, and mushrooms
	 *@param size
	 *   a size that the user can choose between small, medium, large, extralarge
	 *@precondition
	 *	the topping and size must be one of the four choice for each.
	 *@return
	 *	Will ask user to create a pizza with one topping and size and will
	 *compare it to an already created pizza.
	 *@throws default
	 *	will let user know that they must choose one of the four toppings or sizes
	 **/
	 
	public thePizza() {
		this.topping = topping;
		pizzaToppingLogic();
		this.size = size;
		pizzaSizeLogic();
		}
	
	
	public thePizza(int topping, int size) {
		this.topping = topping;
		pizzaToppingLogic();
		this.size = size;
		pizzaSizeLogic();
		}

	/**
	*@param- topping
	*@exceptions- must be one of the four choices for topping
	*@return- no return
	**/
	private void pizzaToppingLogic() {
		switch (topping) {
		case 1: toppingString = "pepperoni";
				break;
		case 2: toppingString = "mushrooms";
				break;
		case 3: toppingString = "sausage";
				break;
		case 4: toppingString = "onions";
				break;
		default: toppingString = "Invalid topping";
				break;
						}
		}

	/**t
	*@param- size
	*@exceptions- must be one of the four choices for size
	*@return- no return
	**/
	private void pizzaSizeLogic() {
		switch (size) {
		case 1: sizeString = "small";
				totalCost += 9.99;
				break;
		case 2: sizeString = "medium";
				totalCost += 12.99;
				break;
		case 3: sizeString = "large";
				totalCost += 14.99;
				break;
		case 4: sizeString = "extra Large";
				totalCost += 17.99;
				break;
		default: sizeString = "Invalid size";
				break;
					}
		}

	/** The user chooses what pizza topping and size they want.
	*@param- topping, size
	*@exceptions- must be one of the four choices for topping or size, if not default statement
	*displayed
	*@return- no return
	**/
	public void orderPizza() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, let's make a pizza!  What topping do you want?"
				+ " Type 1 for pepperoni, 2 for mushrooms, 3 for sausage, and 4 for onions.");
		int topping = scanner.nextInt();
		this.topping = topping;
		pizzaToppingLogic();
		
		System.out.println("Okay, what size would you like the pizza to be?"
				+ "  Type 1 for small, 2 for medium, 3 for large, and 4 for extra large.");
		int size = scanner.nextInt();
		this.size = size;
		pizzaSizeLogic();
		}
	
	/**
	   * Get the current topping for the pizza
	   * @param - topping
	   * @return
	   *   the current topping for the pizza
	   **/
	public String getTopping(){
		return this.toppingString;
	}
	
	/**
	   * Set the current topping for the pizza
	   * @param - topping
	   * @return
	   *   Set the current topping for the pizza
	   **/
	public void setTopping(int topping){
		this.topping = topping;
		pizzaToppingLogic();
		}
	
	/**
	   * Get the current size for the pizza
	   * @param - size
	   * @return
	   *   the current size for the pizza
	   **/
	public String getSize(){
		return this.sizeString;
	}
	
	/**
	   * Set the current size for the pizza
	   * @param - size
	   * @return
	   *   Set the current size for the pizza
	   **/
	public void setSize(int size){
		this.size = size;
		pizzaSizeLogic();
		}
	
	/**
	   * Check the current topping and size on the pizza.
	   * @param - toppingString, sizeString
	   * @return
	   *   Returns the current size and topping of the pizza
	   **/
	@Override
	public String toString() {
	        return "The topping on the pizza: " + toppingString +
	        		" and the size is: " + sizeString;
	    }

	/**
	   * Compare two pizzas to see if size and toppings are the same.
	   * @param - getSize, getTopping
	   * @return
	   *   Returns true or false for if two pizzas have same size and topping
	   **/
	public boolean equals(Object obj) {
	    if (obj instanceof thePizza) {
	    	thePizza pizzaEntityObj= (thePizza) obj;
	    	
	    	if(pizzaEntityObj.getTopping().equals(this.getTopping()) &&
	    	   pizzaEntityObj.getSize().equals(this.getSize()))	{
	    		System.out.println("The pizzas are the same size and have the same topping.");
	    		return true;
	    	}else{
	    		System.out.println("The pizzas are not the same."); 
	    		return false;
	    	}
	    }else{
	    	return false;
	    }
	}
}
