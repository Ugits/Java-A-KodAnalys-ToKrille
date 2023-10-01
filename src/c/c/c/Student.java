package c.c.c;

import java.util.concurrent.TimeUnit;

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

    public void sayHello() throws InterruptedException {
        System.out.println("Hi i´m " + this.name + " and i´m " + this.age + "year´s old!");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("My life times twice is ");
        System.out.println(doubleMyAge(this.age));
        TimeUnit.SECONDS.sleep(1);
    }
}
