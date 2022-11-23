package Blackboard;

public class Student implements Runnable{

    private int id;
    public Student(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("Student working here! + " + id);
            Blackboard.getInstance().write(id, ((int)Math.random()*10));
            try {
                Thread.sleep(1000);
            } catch (Exception e){
            }
        }

    }
}
