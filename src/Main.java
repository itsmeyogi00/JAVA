import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String[] args) {
        JFrame frame= new JFrame("Number");
        frame.setSize(200,200);
        JPanel panel = new JPanel();
        JLabel label= new JLabel("Enter the  number: ");
        JTextField tf= new JTextField("0",5);
        JButton inc= new JButton("Increase");
        JButton dec= new JButton("Decrease");
        JButton reset= new JButton("Reset");

        inc.addActionListener(e->{
            int num= Integer.parseInt(tf.getText());
            num++;
            tf.setText(String.valueOf(num));

        });

        dec.addActionListener(e->{
            int num = Integer.parseInt(tf.getText());
            num--;
            tf.setText(String.valueOf(num));
        });

        reset.addActionListener(e->{
            int num= Integer.parseInt(tf.getText());
            num=0;
            tf.setText(String.valueOf(num));
        });

        panel.add(label);
        panel.add(tf);
        panel.add(inc);
        panel.add(dec);
        panel.add(reset);

        frame.add(panel);
        frame.setVisible(true);
    }
}