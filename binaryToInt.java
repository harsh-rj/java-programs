import java.util.Scanner;

public class binaryToInt {
    public static void main(String[] args) {
        int bit; 
        int deci = 0;
        Scanner sc = new Scanner(System.in);
        bit = sc.nextInt();
        int numOfdigitsInBit = (int) (Math.floor(Math.log10(bit)) + 1);
        for (int i = numOfdigitsInBit; i > 0; i--) {
            int digit = (int) (bit/(Math.pow(10, i)));
            if (digit == 1) {
                deci = deci +  2^(i-1);
            }
        }
        System.out.println(deci);
        sc.close();
    }
}