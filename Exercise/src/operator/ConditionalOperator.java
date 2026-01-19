package operator;

public class ConditionalOperator {
    public static void main(String[] args) {

        int a = 5, b = 10;

        System.out.println(a < b && b > 6);
        System.out.println(a > b || b < 6);
        System.out.println(a == b ? true : false);

    }
}
