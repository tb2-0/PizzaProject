//File : thePizza.java from the package edu.colorado.simulations

import java.util.Scanner;

/***************************************************************************
 * An Order object allows the user to input a pizza order, choosing what size,
 * topping, and how many pizzas to order.
 * 
 * @author Tristan Beyer
 *
 *@version Feb 2, 2015
 ***************************************************************************/
public class theOrder extends thePizza
{
	 String userName;
	 int cost, numberPizzas, userSelects;
	 long userPhone;
	 private theOrder [] team;
/**
 * Construct an order object that is a vehicle for the program	 
 */
public theOrder(){
}


/**
*@param- none
*@precondition- must be one of the 3 selections
*@return- the methods writeOrder(), confirmOrder(), checkOut(), or default
**/
public void mainMenu()
{
	System.out.println("***Welcome to the Pizza Palace***");
	System.out.println("1.Order   2.Confirm   3.Check out");
	System.out.println("Please enter your selection:");
	Scanner keyboard = new Scanner (System.in);
	userSelects = keyboard.nextInt();
	switch(userSelects)  
	{
	case 1: writeOrder();
			break;
	case 2: confirmOrder();
			break;
	case 3: checkOut();
			break;
		
	default: System.out.println("Please choose one of the three selections");
	mainMenu();
	break;
	}
}

/**
 * @param - none
 * @precondition phone number must be a digit, toppings must be one of the 4 choices
 * sizes must be one of the 4 choices
 * @return will take user through selection process and when complete, return them to main menu
 */

public void writeOrder ()
{
	System.out.println("****Order****");
	Scanner keyboard = new Scanner (System.in);
	System.out.println("Please input your name:");
	userName = keyboard.nextLine();
	System.out.println("Please input your phone number:");
	userPhone = keyboard.nextLong();
	System.out.println("Welcome " + userName + "! Here is the menu: ");
	System.out.println("Toppings: 1.pepperoni 2.mushrooms 3.sausage 4. onions");
	System.out.println("Pizza Sizes: 1.)small 2.)medium 3.)large 4.)extra large");
	System.out.println("Cost: Small- $9.99 Medium- $12.99 large- $14.99 extra large- $17.99");
	System.out.println("Enter the number of pizzas you want to order");
	numberPizzas = keyboard.nextInt();
	int [] theOrder = new int[numberPizzas + 1]; 
	for(int i = 1; i <= numberPizzas; i++)
	{
		int [] team = new int [i];
		System.out.println("Enter data for pizza " + i);
		orderPizza();
	}
	mainMenu();
}

/**
 * @param - none
 * @return will return the customer name, customer phone number,
 * order details, and total cost of the order
 */

public void confirmOrder()
{  
  System.out.println("***Pizza Order Confirmation***");
  System.out.println("Customer: " + userName);
  System.out.println("Phone: " + userPhone);
  System.out.println("Order details: ");
  taxTime();
  System.out.println("Pizza Type " + this.getTopping() + " Pizza Size: " + this.getSize() );
  System.out.println();
  System.out.println("");
  System.out.println("Pizza total: $" + totalCost);
  System.out.println("Tax: $" + theTax);
  System.out.println("Grand Total: $" + finalCost);
  mainMenu();
}	

/**
 * @param none
 * @return Closes the program and lets the user know the order will be ready in 15 minutes
 */
public void checkOut()
{
System.out.println("***Check Out***");
System.out.println("Your pizza will be ready in about 15 minutes.");
System.out.println("Thank you for visiting us!  See you next time!");
}

/**
 * @param- none
 * @postcondition will compute the tax for the order and add it to the pre-tax amount,
 * to create the total order cost
 */
public void taxTime()
{
	theTax = totalCost * .1;
	finalCost = totalCost + theTax;
}



public static void main(String[] args) {
	theOrder makeThat = new theOrder();
	makeThat.mainMenu();
}

}
