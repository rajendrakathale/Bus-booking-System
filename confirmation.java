import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
;

public class confirmation extends JFrame {
    public confirmation(){
        setVisible(true);
        setLayout(null);

        JLabel  s1= new JLabel("Congratulation!!");
        s1.setFont(new Font("Osward",Font.BOLD,40));
        s1.setBounds(15,50,320,50);
        s1.setForeground(Color.MAGENTA);
        add(s1);

        JLabel  s2= new JLabel("Your booking has");
        s2.setFont(new Font("Osward",Font.BOLD,25));
        s2.setBounds(55,140,320,40);
        s2.setForeground(Color.darkGray);
        add(s2);

        JLabel  s3= new JLabel("been confirmed");
        s3.setFont(new Font("Osward",Font.BOLD,25));
        s3.setBounds(65,185,320,40);
        s3.setForeground(Color.darkGray);
        add(s3);

        JLabel  s4= new JLabel("HAPPY");
        s4.setFont(new Font("Osward",Font.BOLD,40));
        s4.setBounds(95,245,320,50);
        s4.setForeground(Color.pink);
        add(s4);

        JLabel  s5= new JLabel("JOURNEY");
        s5.setFont(new Font("Osward",Font.BOLD,40));
        s5.setBounds(70,305,320,50);
        s5.setForeground(Color.pink);
        add(s5);

        JButton exit = new JButton("Close");
        exit.setFont(new Font("Arial", Font.BOLD, 14));
        exit.setBounds(115,385,100,30);
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.ORANGE);
        add(exit);

        setSize(350,500);
        setLocation(500,100);

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }
        });


    }



    public static void main(String[] args)
    {
        new confirmation();
    }
}
