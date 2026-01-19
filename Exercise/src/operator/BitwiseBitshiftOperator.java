package operator;

public class BitwiseBitshiftOperator {
    public static void main(String[] args) {

        //Bitwise AND(&)
        int num1 = 8; //1000
        int num2 = 9; //1001
                      //1000 -> 8
        System.out.println(num1&num2);

        //Bitwise Inclusive OR(|)
        int num3 = 5;  //0101
        int num4 = 15; //1111
                       //1111
        System.out.println(num3|num4);

        //Bitwise Exclusive OR(^)
        int num5 = 23; //10111
        int num6 = 11; //01011
                       //11100
        System.out.println(num5^num6);

        //Bitwise Complement(~)  use 32-bit
        int num7 = 63; //111111
        System.out.println(~num7); //~x = -(x+1)

        //Bitwise signed left-shift(<<)
        int num8 = 3; //0011
                      //001100
        System.out.println(num8 << 2);

        //Bitwise signed right-shift(>>)
        int num9 = 3; //0011
                      //0000
        System.out.println(num9 >> 2);
    }
}
