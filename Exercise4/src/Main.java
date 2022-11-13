import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        //System.out.println("Enter any Number :- ");

        if(num % 2 == 0 && num > 0) {
            System.out.println(num + " is even and Positive");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println(num + " is even and Negative");
        } else if (num % 2 != 0 && num > 0) {
            System.out.println(num + " is Odd and Positive");
        } else if (num % 2 != 0 && num < 0) {
            System.out.println(num + " is Odd and Negative");
        }

    }

}