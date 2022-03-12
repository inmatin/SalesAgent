package lab5;

/**
 * File Name: SalesSupervisor.java<br>
 * Author: Ishtiaque Matin, ID# 041042199<br>
 * Professor: Sandra Iroakazi<br>
 * Course: CST8284_302<br>
 * Assignment: Lab 05<br>
 * Date: Feb 21st, 2022<br>
 * <p>
 */

/**
 * Purpose:<br>
 * This lab focuses on the concept of Inheritance, Super classes, subclasses,
 * super keyword, toString().<br>
 * 
 * Class SalesSupervisor shows a Sales Agent with a name, a age and a
 * location.<br>
 * 
 * Class SalesSupervisor inherits from class SalesAgent.<br>
 * 
 * <p>
 * Class List: {@link SalesAgent}, {@link SalesChief}, {@link SalesSupervisor},
 * {@link SalesAgentTest}, {@link SalesAgentTest2}
 * 
 * <p>
 * 
 * @author Ishtiaque Matin, ID# 041042199
 * @version Modified: Feb 21st, 2022
 * @since JDK 1.8
 * @see SalesAgent
 * @see SalesChief
 * @see SalesSupervisor
 * @see SalesAgentTest
 * @see SalesAgentTest2
 */
public class SalesSupervisor extends SalesAgent {

	/**
	 * the extends keyword is used to indicate that the class which is being defined
	 * is derived from the base class using inheritance. So basically, extends
	 * keyword is used to extend the functionality of the parent class to the
	 * subclass.<br>
	 */

	private String location;

	/**
	 * This portion constructs a SalesSupervisor object.<br>
	 * 
	 * @param n the name of the Sales Agent
	 * @param a the age of the Sales Agent
	 * @param l the location of the Sales Agent
	 * 
	 *          <p>
	 *          super - keyword refers to superclass (parent) objects. It is used to
	 *          call superclass methods, and to access the superclass
	 *          constructor.<br>
	 */
	public SalesSupervisor(String n, int a, String l) {
		super(n, a);
		location = l;

	}

	/**
	 * A method that returns the value given to it in string format.<br>
	 * Returns the string representation of the object.<br>
	 * 
	 * Override override the parent class method<br>
	 * 
	 * @return a string representation of the object<br>
	 * 
	 */

	@Override
	public String toString() {
		return "Sales Supervisor [super=" + super.toString() + ",location=" + location + "]";
	}
}