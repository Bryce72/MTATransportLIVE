import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ScreenDisplay extends JPanel implements Runnable, ActionListener {

    private Thread thread;

    JLabel label = new JLabel("Selected: None");
    String[] choices = { "Forest Hills 75th", "Forest Hills 71st", "LIRR to Penn", "LIRR to Grand" };
    final JComboBox<String> cb = new JComboBox<>(choices);



    public ScreenDisplay(){
            this.setLayout(new FlowLayout());
            this.add(cb);

    }

    public void startProgram() {
        this.thread = new Thread(this);
        this.thread.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == cb) {
            String selectedChoice = (String) cb.getSelectedItem();
            label.setText("Selected: " + selectedChoice);
        }

    }

    @Override
    public void run() {

        System.out.println("running");

    }
}
