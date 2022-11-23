package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        switch (action) {
            case "One" -> System.out.println("Action 1");
            case "Two" -> System.out.println("Action 2");
            case "Three" -> System.out.println("Action 3");
        }
    }
}
