package operator;

public class UnaryOperator {
    public static void main(String[] args) {

        double a = 2.4;
        boolean isCheck = true;

        System.out.println(+a);
        System.out.println(-a);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(!isCheck);

        System.out.println("========================");

        double result = 200.3;
        System.out.println(result++);
        System.out.println(result);
        System.out.println(++result);
        System.out.println(result);

    }
}
