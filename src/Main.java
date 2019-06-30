import model.Student;

public class Main {

    public static void main(String[] args) {
        // 在model外部的一个类里面生成学生实例，并打印出学生的所有属性。
        Student stu = new Student("murphy", 22, null, "1517070039");
        System.out.println("student name: " + stu.name);
        System.out.println("age is: " + stu.getAge());
        stu.setSex("girl");
        System.out.println("She is a " + stu.getSex());
        System.out.println("Her STUDENT ID is: " + stu.getID());
    }
}
