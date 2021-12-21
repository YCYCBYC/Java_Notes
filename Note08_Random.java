//  import package
import java.util.Random;
import java.util.Scanner;

public class Note08_Random {
    public static void main(String[] args) {
        
        Random r = new Random();

        int ranNumber = r.nextInt(10);  //  from 0 to 9

        System.out.println(ranNumber);
        System.out.println("--------");
        
        
        //  guess number
        
        //  generate a random number
        ranNumber = r.nextInt(100) + 1;
        System.out.println("There is a random number from 1 to 100.");

        //  a loop
        while(true) {
            
            //  input the guess number
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your number:");
            int guessNumber = sc.nextInt();

            // compare the ranNumber and guessNumber
            if(guessNumber > ranNumber) {
                System.out.println("Your number is large.");
            }else if (guessNumber < ranNumber) {
                System.out.println("Your number is small.");
            } else {
                System.out.println("Your number is correct.");
                break;
            }
            sc.close();

        }

    }
}
