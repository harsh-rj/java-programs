
// A program to convert binary to integer
import java.util.Scanner;

public class binaryToInt {
    public static int getDigitAt(int num, int place) {
        int noOfDigits = ((int) Math.floor(Math.log10(num)) + 1);
        int digit;
        if (place < 0 || place > noOfDigits) {
            return -1;
        } else {
            digit = ((int) (num % Math.pow(10, (place + 1))) / (int) Math.pow(10, place));
            return digit;
        }
    }

    public static void main(String[] args) {
        int bit;
        int deci = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary num:.");
        bit = sc.nextInt();
        int numOfdigitsInBit = ((int) Math.floor(Math.log10(bit)) + 1);
        for (int i = 0; i < numOfdigitsInBit; i++) {
            if (getDigitAt(bit, i) == 1) {
                deci += (int) Math.pow(2, i);
            }
        }
        System.out.println("in decimal: " + deci);
        sc.close();
    }
}

/*
 * Output:
 * -------------------
 * enter the binary num:.
 * 10101
 * in decimal: 21
 */