package operator;

public class CharExample {
    public static void main(String[] args) {

        //Char Data Type -> 0 - 65535 'A'
        char c1 = 'H'; //72 in decimal
        char c2 = '5'; //53 in decimal

        System.out.println(Character.isLetter(c1));
        System.out.println(Character.isLetter(c2));

        char letter1 = 67; //C
        int num1 = letter1 + 3; //67 + 3 = 70 -> F in ASCII
        char letter2 = (char) num1;
        System.out.println(letter2);

    }
}
