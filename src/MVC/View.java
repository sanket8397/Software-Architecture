package MVC;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    View(){
        Controller controller = new Controller();

        JButton button1 = new JButton("One");
        JButton button2 = new JButton("Two");
        JButton button3 = new JButton("Three");

        setLayout(new GridLayout(3, 1));
        add(button1);
        add(button2);
        add(button3);

        button1.addActionListener(controller);
        button2.addActionListener(controller);
        button3.addActionListener(controller);
    }

    public static void main(String[] args) {
        View view = new View();
        view.setSize(500,500);
        view.setVisible(true);
        view.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
