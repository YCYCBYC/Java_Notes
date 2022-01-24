//  use Note15


public class Note16_PrivateDemo {
    public static void main(String[] args) {

        //  create new object
        Note15_Private stu = new Note15_Private();
        
        
        //  assign values
        stu.setName("Cheng");
        stu.setAge(-4);
        stu.show();
        System.out.println("--------");
        
        stu.setNameTest("Yao");
        stu.setAge(22);
        System.out.println("--------");


        //  get values
        System.out.println(stu.getName());
        System.out.println(stu.getAge());



    }

    
}
