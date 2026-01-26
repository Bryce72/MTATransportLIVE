import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;


public class WindowEntry extends JFrame{

    private ScreenDisplay screenDisplay;
    public WindowEntry(){
        super("MTA Subway Stuff");
        this.setSize(600, 475);
        this.setLocation(400, 200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.screenDisplay = new ScreenDisplay();
        this.add(this.screenDisplay);

    }

    public void startProgram() {
        this.setVisible(true);
        this.screenDisplay.startProgram();
    }

    public static void main(String[] args) {
        WindowEntry test = new WindowEntry();
        test.startProgram();
    }

}
