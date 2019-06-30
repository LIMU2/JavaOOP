package model;

// 在Student类里面有学生姓名，年龄，性别，学号。
// 提供构造方法和各个属性的get/set方法给Student类。
public class Student {
    // 成员变量
    public String name; // 学生姓名
    public int age;  // 年龄
    public String sex;  // 性别
    public String ID;  // 学号

    // 构造方法
    public Student(String name, int age, String sex, String ID) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.ID = ID;
    }

    // 成员方法

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
