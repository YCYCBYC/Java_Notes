public class Note10_Method {
    public static void main(String[] args) {
        
        isEven();
        getMax(5,6);
        getMax(8,9);

        boolean number = isOdd(8);
        System.out.println(number);

    }


    //  Define a menthod
    public static void isEven() {  
        int number = 5;
        if(number%2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    
    //  Define method with parameters
    public static void getMax(int x1, int x2) {
        if(x1 > x2) {
            System.out.println(x1);
        } else if(x1 == x2) {
            System.out.println("two numbers are same");
        } else {
            System.out.println(x2);
        }
    }


    //  Define method with return value (not output)
    public static boolean isOdd(int number) {
        if(number%2 == 0) {
            return false;
        } else {
            return true;
        }
    }

}
