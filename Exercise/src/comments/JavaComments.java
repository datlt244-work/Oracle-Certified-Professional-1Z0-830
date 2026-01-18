package comments;

public class JavaComments {

    /*
    This is multi-line comment
    Main method
     */

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //Print Hello World
        System.out.println("Hello World");

        multi(5,10);

    }

    /**
     * This method multiplies two integer values
     * @param a is the first value
     * @param b is the second value
     */
    public static void multi(int a, int b){
        System.out.println(a*b);
    }
}
