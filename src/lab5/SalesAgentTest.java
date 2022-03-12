package lab5;

/**
   This program is the tests for the SalesAgent class including the subclass.
*/

/**
 * File Name: SalesAgentTest.java<br>
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
 * Class SalesAgentTest runs a program to test for the class SalesAgent
 * including the subclass.<br>
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
public class SalesAgentTest {
	/**
	 * @param args Command line arguments are not used by this program.<br>
	 * 
	 * <p>
	 *             testing the class SalesAgent.<br>
	 *             testing the class SalesSupervisor.<br>
	 * 
	 */
	public static void main(String[] args) {

		// ... your code starts here!

		System.out.println("SAMPLE OUTPUT FOR SalesAgentTest\n");

		SalesAgent sa1 = new SalesAgent("Andrew", 42);

		SalesSupervisor ss1 = new SalesSupervisor("James", 26, "Perth");

		System.out.println(sa1);
		System.out.println(ss1);

	}
}