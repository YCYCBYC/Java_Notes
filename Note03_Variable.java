//  byte short int* long
//  float double*
//  char
//  boolean
//  add L after defining a long variable, add F after defining a float variable

//  varibale name: number letter _ $
//  use XxxXxx name class
//  use xxxXxx name variable

public class Note03_Variable {
    public static void main(String[] args) {
        
        short a = 10;
        System.out.println(a);

        a = 20;
        System.out.println(a);
        
        //add L after a long
        long b = 1000000000000L;  
        System.out.println(b);

        float c = 12.34F;
        System.out.println(c);

        //  automatic transfer variable class
        double d = 10;
        System.out.println(d);

        //  force transfer variable class
        int k = (int)11.88;
        System.out.println(k);
    }
}