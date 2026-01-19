package operator;

public class AssignmentOperator {
    public static void main(String[] args) {

        int a = 15, b = 10, result = 0;

        result = a + b;
        System.out.println(result);

        result += a;//result = result + a
        System.out.println(result);

        result -= a;//result = result - a
        System.out.println(result);

        result /= a;//result = result / a
        System.out.println(result);

        result *= a;//result = result * a
        System.out.println(result);

        result %= a;//result = result % a
        System.out.println(result);

    }
}
