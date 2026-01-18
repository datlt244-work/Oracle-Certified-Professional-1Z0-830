package inputoutput;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a,b;
        System.out.print("Please enter number 1: ");
        a = sc.nextInt();
        System.out.print("Please enter number 2: ");
        b = sc.nextInt();

        System.out.println("Total: " + (a+b));
    }
}
