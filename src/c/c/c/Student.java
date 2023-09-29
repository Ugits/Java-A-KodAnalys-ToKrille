package c.c.c;

public class Student {

    int age;
    String name;


    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int doubleMyAge(int age) {
        return this.age * 2;
    }

    public void sayHello() {
        System.out.println("Hi i´m " + this.name + " and i´m " + this.age + "year´s old!");
        System.out.print("My life times twice is ");
        System.out.println(doubleMyAge(this.age));
    }

}
