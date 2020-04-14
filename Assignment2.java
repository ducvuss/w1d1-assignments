import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secret = (int) (Math.random() * 100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Please, guess the secret number:");
            int guess = in.nextInt();
            
            if (guess >= secret - 10 && guess <= secret + 10) {
                System.out.println("Your guess is accepted");
                System.out.println(secret);
                return;
            } else {
                System.out.println("Your guess is not accepted, you get another chance!");
            }
        }
        System.out.println("Sorry! This your guesses are not within the accepted range.");
        System.out.println(secret);
    }
}