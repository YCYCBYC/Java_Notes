//  顺序结构
//  分支结构  if  switch
//  循环结构  for  while

public class Note06_If_Switch {
    public static void main(String[] args) {
        
        byte a = 1;
        byte b = 0;
        
        //  simple if
        if (a > b) {
            System.out.println("That is true");
        }
        System.out.println("--------");


        //  complex if
        if (a < b) {
            System.out.println("That is not corect");
        } else if (a > b) {
            System.out.println("That is correct");
        } else {
            System.out.println("That is useless");
        }
        System.out.println("--------");


        //  switch
        //  case can go through directly
        switch (++a) {
            case 0:
                System.out.println("0 is 2");
                break;
            case 1:
            case 3:
            case 5:
                System.out.println("odd is 2");
                break;
            default:
                System.out.println(a + " has no match");
        }
        System.out.println("--------");

        
    }
}
