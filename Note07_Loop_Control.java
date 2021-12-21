
//  for (条件初始；条件判断；条件控制) {
//      循环内代码
//  }


public class Note07_Loop_Control {
    public static void main(String[] args) {

        //  for 1~3
        for(int i=1; i<=3; i++) {
            System.out.println(i + " is less than 4");
        }
        System.out.println("--------");


        //  for Print Daffodil Number
        for(int i=100; i<1000; i++) {
            int a = i%10;
            int b = (i/10)%10;
            int c = i/100;
            if(i == a*a*a + b*b*b + Math.pow(c,3)){
                System.out.println(i + " is a daffodil number");    
            }
            
        }
        //  System.out.println(i);  i is only included in for loop
        System.out.println("--------");


        //  while : may not run the inside code
        int j = 1;
        while(j<=3) {
            System.out.println("Test");
            j++;
        }
        System.out.println(j);
        System.out.println("--------");


        //  do while :  at least run one time of the code inside
        do {
            System.out.println("Test2");
            j++;
        }while(j<=6);
        System.out.println("--------");


        // while Fold Paper
        double t = 0.1;  //  initial thickness
        int count = 0;  //  counter
        while(t <= 8844430) {
            t = t* 2;
            count += 1;
        }
        System.out.println("The fold time is " + count);
        System.out.println("--------");


        // continue : used to skip the current loop and run the next loop
        // break : used to break the whole loop 
        
    }
}
