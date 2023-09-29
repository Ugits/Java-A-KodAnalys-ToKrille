package c.c.c;

public class main {

    public static void main(String[] args) {

        Student student = new Student("Jonas", 35);
        student.sayHello();
        runMyForLoop();
    }

    public static void runMyForLoop() {
        for (int i = 0; i < 5; i++){
            System.out.println("Inside the method runMyForLoop " + i);
        }
    }
}
/* TODO
 *   Change the names of files + packages to relevant names
 *   Find the errors in the code and resolve it!
 */


