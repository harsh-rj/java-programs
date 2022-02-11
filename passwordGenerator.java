
/* 
    Just a program to generate a random password 
    since random is improbable 
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class passwordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the password to be generated:. ");
        int passLength = sc.nextInt();
        ArrayList<Integer> source = new ArrayList<Integer>();
        int ascii = 35;
        while (ascii <= 90) { // adding ascii codes of passwords chars
            if (35 <= ascii && ascii <= 38) {
                source.add(ascii); // adding some symbols
            } else if (48 <= ascii && ascii <= 57) {
                source.add(ascii); // adding the digits
            } else if (63 <= ascii && ascii <= 90) {
                source.add(ascii); // adding ?, @ and the cap alphabets
            } else if (97 <= ascii && ascii <= 122) {
                source.add(ascii); // adding ?, @ and the cap alphabets
            }
            ascii++;
        }
        Random rd = new Random();
        int randomIndex;
        int asciiCode;
        char asciiChar;
        int choices = 0;
        System.out.println("Choose any of the following you prefer:.");
        while (choices < 5) {
            System.out.print("\nPass " + choices + ":.  ");
            for (int i = 0; i < passLength; i++) {
                randomIndex = rd.nextInt(source.size()); // genrating a random number form 0 to length of 'source' arraylist
                asciiCode = source.get(randomIndex); // getting the int at that random index
                asciiChar = (char) asciiCode; // converting the int that is an ascii code into char
                System.out.print(asciiChar); // print the char
            }
            choices++;
        }
        sc.close();
    }
}
