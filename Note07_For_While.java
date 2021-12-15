/*
for (条件初始；条件判断；条件控制) {
    循环内代码
}
*/

public class Note07_For_While {
    public static void main(String[] args) {

        //  1~5
        for(int i=1; i<=5; i++) {
            System.out.println(i + " is less than 6");
        }
        
        //  Print Daffodil Number
        for(int i=100; i<1000; i++) {
            int a = i%10;
            int b = (i/10)%10;
            int c = i/100;
            if(i == a*a*a + b*b*b + Math.pow(c,3)){
                System.out.println(i + " is a daffodil number");    
            }
            
        }
        

    }
}
