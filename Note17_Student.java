//  构造方法
//  public class 类名{
//    public 类名(参数){
//
//    }
//  }


public class Note17_Student {

    private String name;
    private int age;

    //  no parameter method
    public Note17_Student(){
        System.out.println("No parameter method.");
    }
    
    //  only string
    public Note17_Student(String name) {
        this.name = name;
    }
        
    //  only int
    public Note17_Student(int age) {
        this.age = age;
    }

    // combine
    public Note17_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //  display
    public void show(){
        System.out.println(name + "," + age);
    }


} 