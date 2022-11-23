package Blackboard;

public class Classroom {
    public static void main(String[] args){
        Thread thread1 = new Thread(new Student(0));
        Thread thread2 = new Thread(new Student(1));
        Thread thread3 = new Thread(new Professor());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
