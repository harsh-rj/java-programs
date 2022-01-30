
// A program to convert integer to binary
import java.util.LinkedList;
import java.util.Scanner;

public class intToBinary {
    public static void main(String[] args) {
        int deci, r;
        System.out.print("Enter the Integer:.");
        Scanner sc = new Scanner(System.in);
        deci = sc.nextInt();
        LinkedList<Integer> binary = new LinkedList<Integer>();
        if (deci < 0) {
            System.out.println("Please enter any non-negative integer;");
        } else if (deci == 0) {
            System.out.println("0");
        } else {
            while (deci != 0) {
                r = deci % 2;
                binary.addFirst(r);
                ;
                deci = deci / 2;
            }
            for (int i = 0; i < binary.size(); i++) {
                System.out.print(binary.get(i));
            }
        }
        sc.close();
    }
}

/*
 * Output:
 * -------------------
 * Enter the Integer:.
 * 4781947
 * 10010001111011101111011
 */