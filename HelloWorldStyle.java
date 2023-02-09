/** .
* The HelloWorld program implements an application that
* simply displays "Hello World!" to the standard output
*
* @author  Melody Berhane
* @version 1.0
* @since   2023-2-08
*/

public final class HelloWorldStyle {

    /** .
    * This is a private constructor used to satisfy the
    * style checker
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }

    /** .
    * Displays text to the terminal
    *
    * @param args nothing passed in
    */
    public static void main(String[] args) {
        System.out.println("Hello world! with style");
    }
}
