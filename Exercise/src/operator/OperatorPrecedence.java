package operator;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 5 + 1 * 4;
        System.out.println(result);

        int result1 = (5 + 1) * 4;
        System.out.println(result1);

        result += 80 / 20 % 8 * 3 + -5;
        System.out.println(result);
    }
}
