import javax.swing.*;

public class Framess {
    JFrame BorderFrame;

    public Framess(){
          this.createFrame();
    }

    public JFrame createFrame(){
        BorderFrame = new JFrame();
        BorderFrame.setSize(1000,500);
        BorderFrame.setTitle("My First Frame");
        BorderFrame.setVisible(true);
        return BorderFrame;


    }
}
