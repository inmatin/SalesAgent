package lab5;

/**
 * This program is the tests for the SalesAgent class including the subclasses.
 */

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
 * Class SalesAgentTest2 runs a program to test for the class SalesAgent
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
public class SalesAgentTest2 {
	/**
	 * @param args Command line arguments are not used by this program.<br>
	 * 
	 * <p>
	 *             testing the class SalesAgent.<br>
	 *             testing the class SalesSupervisor.<br>
	 *             testing the class SalesChief.<br>
	 */
	public static void main(String[] args) {

		// ... your code starts here!

		System.out.println("SAMPLE OUTPUT FOR SalesAgentTest2\n");

		SalesAgent sa1 = new SalesAgent("Peter", 56);
		SalesAgent sa2 = new SalesAgent("John", 48);

		SalesSupervisor ss1 = new SalesSupervisor("Ifeoma", 53, "Toronto");

		SalesChief sc1 = new SalesChief("Ishtiaque Matin", 16, "Ottawa");

		System.out.println(sa1);
		System.out.println(sa2);
		System.out.println(ss1);
		System.out.println(sc1);
	}
}