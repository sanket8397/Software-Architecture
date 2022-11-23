package Blackboard;

import java.util.Vector;

public class Blackboard {
    private static Blackboard instance;
    private Vector<Integer> data;

    private Blackboard(){
        data = new Vector<>(10);
        data.add(10);
        data.add(25);
    }

    public static Blackboard getInstance(){
        if (instance == null){
            instance = new Blackboard();
        }
        return instance;
    }

    public void write(int index, int item){
        data.add(index, item);
    }

    public int read(int index){
        return data.get(index);
    }
}
