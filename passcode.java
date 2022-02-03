/* 
    Just a program to generate a random passcode 
    since random is improbable 
*/
import java.util.Random;
import java.util.Scanner;

public class passcode {
    public static void main(String[] args) {
        System.out.println("Enter number of digits:.");
        Scanner sc = new Scanner(System.in);
        int dig = sc.nextInt();
        Random rd = new Random();
        for (int i = 0; i < dig; i++) {
            System.out.print(rd.nextInt(9));
        }
        sc.close();
    }
}
