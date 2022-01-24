//  Note13_Class_Phone  是类名，无法运行
//  Note14_Object_Phone  是测试类，需要main方法


public class Note14_Object_Phone {
    public static void main(String[] args) {

        //  create an object: p
        Note13_Class_Phone p = new Note13_Class_Phone();
        
        //  use variables without value
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println("--------");
        //  assign value to variables
        p.brand = "SAMSUNG";
        p.price = 899;
        System.out.println(p.brand);
        System.out.println(p.price);
        System.out.println("--------");
        //  use method
        p.call();
        p.message();
        System.out.println("--------");


        //  create another object with same class: ps
        Note13_Class_Phone ps = new Note13_Class_Phone();
        ps.brand = "Apple";
        ps.price = 1099;
        //  use variables
        System.out.println(ps.brand);
        System.out.println(ps.price);
        System.out.println("--------");
        //  use method
        ps.call();
        ps.message();
        System.out.println("--------");


    }
}

