//  import package
import java.util.Scanner;

public class Note05_DataInput {
    public static void main(String[] args) {
        
        //  create target
        Scanner sc = new Scanner(System.in);
        
        //  recieve data
        System.out.println("Enter a number to calculate square:");
        int x = sc.nextInt();
        
        //  output data
        System.out.println("x^2 = " + x*x);

        // close the scanner
        System.out.println("Closing Scanner...");
        sc.close();
        System.out.println("Scanner Closed.");
    }
}
