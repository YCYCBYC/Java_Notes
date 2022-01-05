//  private 变量只能在这个class中使用
//  定义方法 set, get 来从别的地方调用值


public class Note15_Private {
    
    //  define variables
    private int age;
    private String name; 

    
    //  define method of set variables
    public void setAge(int a) {
        if(a<0 || a>120) {
            System.out.println("Entered name is not real.");
        } else {
            age = a;
            System.out.println("Age has been assigned.");
        }
    }
    public void setName(String n) {
        name = n;
    }


    //  define method of set variables
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }


    //define method
    public void show() {
        System.out.println(name + " " + age);
    }


}
