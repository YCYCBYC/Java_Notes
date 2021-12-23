//  方法重载：
//  多个方法在一个class中
//  多个方法具有同样的方法名
//  多个方法的参数不同：类型不同或者数量不同


public class Note11_MethodOverload {
    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(sum(1.1, 2.1));
        System.out.println(sum(1, 2, 3));

    }


    //  Method 1
    public static int sum(int a, int b) {
        return a+b;
    }


    //  Method 2
    public static double sum(double a , double b) {
        return a+b;
    }


    // Method 3
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
}