//  整数相除只能得到整数

public class Note04_Operator {
    public static void main(String[] args) {
       
        int a = 3;
        a += 3;  // =6  force variable class tansfer, RECOMMENDED
        int b = 4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);  //  整除
        System.out.println(a % b);  //  余数
        System.out.println(6.00 / 2);
       
        System.out.println("--------");  //--------
       
        //  character can be calculated
        //  'A' - 65    'a' - 97    '0' - 48
        //  '  '
        //  类型提升
        char c = 'B';  
        System.out.println(c);
        System.out.println(a + c);
        int ac = a + c;
        System.out.println(ac);
        
        System.out.println("--------");  //--------

        //  string +
        // order maters
        System.out.println("Cheng" + "Yao");
        System.out.println("Cheng" + "Yao" + 07 + 12);
        System.out.println(1 + 1 + "Cheng" + "Yao");

        System.out.println("--------");  //--------

        // relationship operators
        System.out.println(a == b);
        System.out.println(a = b);  //  error try
        System.out.println(a != b);

        System.out.println("--------");  //--------

        //  logistic operators
        //  ^ same is true  different if false 逻辑异或
        //  &&  ||  短路逻辑运算符，可以确定结果则不运行右边
        System.out.println(a>1 & b>1);
        System.out.println(a>1 & b<1);

        System.out.println("--------");  //--------

        // 三元运算符
        int max = (a == b ? a : b);
        System.out.println(max);

    }
}
