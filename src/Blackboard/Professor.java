package Blackboard;

public class Professor implements Runnable{

    @Override
    public void run() {
        while(true){
            System.out.println("Professor is here! ");
            System.out.println("-- Reading: " + Blackboard.getInstance().read(0));
            System.out.println("-- Reading: " + Blackboard.getInstance().read(1));
            try {
                Thread.sleep(1000);
            } catch (Exception e){
            }
        }

    }
}
