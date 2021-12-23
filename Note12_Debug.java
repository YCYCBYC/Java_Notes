import java.util.Scanner;


public class Note12_Debug {
    public static void main(String[] args) {
        
        //  sum all even number within max
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int max = sc.nextInt();
        int sum = 0;
        
        for(int i=0; i<=max; i++) {
            if(i%2 == 0) {
                sum = sum + i;
            }
        }
        
        System.out.println(sum);
        sc.close();

    }


}
