package operator;

public class ArithmeticOperator {
    public static void main(String[] args) {

        double num1 = 8.4, num2 = 4.3, result = 0.0;

        result = num1 + num2;
        System.out.println(result);

        result = num1 - num2;
        System.out.println(result);

        result = num1 * num2;
        System.out.println(result);

        result = num1 / num2;
        System.out.println(result);

        result = num1 % num2;
        System.out.println(result);

        System.out.println("===============================");

        String str1 = "My";
        String str2 = "Name";
        String str3 = str1 + str2;
        System.out.println(str3);

    }
}
