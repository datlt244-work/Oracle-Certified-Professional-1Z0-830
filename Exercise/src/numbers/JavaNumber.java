package numbers;

public class JavaNumber {
    public static void main(String[] args) {

        //Octal
        int octalNumber1 = 015; //this will be stored as 13 in decimal
        int octalNumber2 = 0104; //this will be stored as 68 in decimal
        int sumOctalNumber = octalNumber1 + octalNumber2;
        System.out.println(sumOctalNumber);
        System.out.println(Integer.toOctalString(sumOctalNumber));

        System.out.println("============================================");
        //Hexadecimal
        int hexNumber1 = 0x1B0; //432 in decimal
        int hexNumber2 = 0x2F; //0-9 A-F   47 in decimal
        int sumHexNumber = hexNumber1 + hexNumber2;
        System.out.println(sumHexNumber);
        System.out.println(Integer.toHexString(sumHexNumber));

        System.out.println("============================================");
        //Binary
        int binNumber1 = 0b1001; //9 in decimal
        int binNumber2 = 0b1101; //13 in decimal
        int sumBinNumber = binNumber1 + binNumber2;
        System.out.println(sumBinNumber);
        System.out.println(Integer.toBinaryString(sumBinNumber));

    }
}
