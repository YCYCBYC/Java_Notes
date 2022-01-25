//  构造方法Demo




public class Note18_StudentDemo{

    public static void main(String[] args){

        Note17_Student s1 = new Note17_Student();
        s1.show();

        Note17_Student s2 = new Note17_Student(22);
        s2.show();

        Note17_Student s3 = new Note17_Student("Cheng");
        s3.show();

        Note17_Student s4 = new Note17_Student("Cheng", 20);
        s4.show();
    }

}