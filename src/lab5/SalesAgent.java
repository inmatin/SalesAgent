package lab5;

// This is Lab 5. Follow all instructions stated in the Lab slides.

/**
 * File Name: SalesAgent.java<br>
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
 * Class SalesAgent show a Sales Agent with a name and age.<br>
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
public class SalesAgent {
	private String name;
	private int age;

	/**
	 * This portion constructs a SalesAgent object.<br>
	 * 
	 * @param n the name of the Sales Agent
	 * @param a the age of the Sales Agent
	 */
	public SalesAgent(String n, int a) {
		name = n;
		age = a;

	}

	/**
	 * A method that returns the value given to it in string format.<br>
	 * Returns the string representation of the object.<br>
	 * 
	 * @return a string representation of the object
	 */

	public String toString() {
		return "Sales Agent [name=" + name + ",age=" + age + "]";
	}

}