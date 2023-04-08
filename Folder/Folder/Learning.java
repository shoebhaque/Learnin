import javax.swing.*;
public class Learning {
    JFrame frame;
    Learning(){
        frame =new JFrame("My Window");
        frame.setVisible(true);
        frame.setBounds(300,300,500,300);
    }
    public static void main(String[] args) {
        new Learning();
    }
}
