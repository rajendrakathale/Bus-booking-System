import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.toedter.calendar.JDateChooser;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class booking extends JFrame {
    public booking(){

        JLabel l1 = new JLabel("                 Book Your Ticket");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        l1.setBounds(100,135,470,50);
        l1.setBackground(Color.white);
        l1.setForeground(Color.MAGENTA);
        l1.setAlignmentX(CENTER_ALIGNMENT);
        l1.setOpaque(true);
        add(l1);

        JLabel  s2= new JLabel("From   : ");
        s2.setFont(new Font("Osward",Font.BOLD,20));
        s2.setBounds(180,220,200,30);
        s2.setForeground(Color.white);
        add(s2);

        String[] from = {"Pune", "Mumbai","Aurangabad","Nashik","Nagpur","Ratnagiri","Satara","Goa","Raigad"};
        JComboBox fromcity = new JComboBox(from);
        fromcity.setBounds(280,220,200,30);
        add(fromcity);

        JLabel  s3= new JLabel("To       : ");
        s3.setFont(new Font("Osward",Font.BOLD,20));
        s3.setBounds(180,290,200,30);
        s3.setForeground(Color.white);
        add(s3);

        String[] to = {"Mumbai","Pune","Aurangabad","Nashik","Nagpur","Ratnagiri","Satara","Goa","Raigad"};
        JComboBox tocity = new JComboBox(to);
        tocity.setBounds(280,290,200,30);
        add(tocity);

        JLabel  s4= new JLabel("Date      : ");
        s4.setFont(new Font("Osward",Font.BOLD,20));
        s4.setBounds(180,360,200,30);
        s4.setForeground(Color.white);
        add(s4);


        JDateChooser date = new JDateChooser();
        date.setFont(new Font("Arial", Font.BOLD, 10));
        date.setBounds(280,360,200,30);
        date.setBackground(Color.lightGray);
        add(date);

        JLabel  s8= new JLabel("Adult :");
        s8.setFont(new Font("Osward",Font.BOLD,20));
        s8.setBounds(180,430,70,30);
        s8.setForeground(Color.white);
        add(s8);

        String[] a = {"1","2","3","4","5","6"};
        JComboBox adult = new JComboBox(a);
        adult.setBounds(250,430,70,30);
        add(adult);

        JLabel  s9= new JLabel("Child :");
        s9.setFont(new Font("Osward",Font.BOLD,20));
        s9.setBounds(335,430,70,30);
        s9.setForeground(Color.white);
        add(s9);

        String[] c = {"0","1","2","3","4","5","6"};
        JComboBox child = new JComboBox(c);
        child.setBounds(405,430,70,30);
        add(child);
//
        JButton book = new JButton("BOOK");
        book.setFont(new Font("Arial", Font.BOLD, 16));
        book.setBounds(290,500,100,30);
        book.setBackground(Color.BLACK);
        book.setForeground(Color.orange);
        add(book);

        JLabel l2 = new JLabel();
        l2.setFont(new Font("Raleway", Font.BOLD, 25));
        l2.setBounds(100,125,470,450);
        l2.setBackground(Color.darkGray);
        l2.setAlignmentX(CENTER_ALIGNMENT);
        l2.setOpaque(true);
        add(l2);

        JLabel imgbus = new JLabel(new ImageIcon("D:\\\\5th\\\\ADBMS\\\\mini project\\\\b.png"));
        imgbus.setBounds(0,-17,1250,700);
        imgbus.setSize(1250, 700);
        imgbus.setBackground(Color.blue);
        add(imgbus);

        JButton x =  new JButton("sd");
        add(x);

        setVisible(true);
        setLayout(null);

        setSize(1250,700);
        setLocation(220,60);

        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    /**** Connect to MongoDB ****/
                    // uses MongoClient
                    MongoClient mongo = new MongoClient("localhost", 27017);

                    /**** Get database ****/
                    // if database doesn't exists, MongoDB will create it for you
                    DB db = mongo.getDB("pvg");

                    /**** Get collection / table from 'testdb' ****/
                    // if collection doesn't exists, MongoDB will create it for you
                    DBCollection table = db.getCollection("booking");



                    //Insert Document
                    if(ae.getSource()==book)
                    {

                        Object s1 = fromcity.getSelectedItem();
                        Object s2= tocity.getSelectedItem();
                        String s3= ((JTextField) date.getDateEditor().getUiComponent()).getText();
                        Object s4= adult.getSelectedItem();
                        Object s5= child.getSelectedItem();





                        BasicDBObject document = new BasicDBObject();
                        document.put("FROM : ", s1);
                        document.put("TO : ", s2);

                        document.put("ADULT : ", s4);
                        document.put("CHILD : ", s5);

                        int flag = 0;
                        //checking whether password is not empty
                        if(s3.isEmpty()==true){
                            JOptionPane.showMessageDialog(null,"Please enter an date");
                            flag = 0;
                        }else{
                            flag = 1;
                            document.put("DATE : ", s3);

                        }

                        if(flag == 1){

                            table.insert(document);
                            JOptionPane.showMessageDialog(book,"your booking successfully");

                            bookconfirm aa = new bookconfirm();
                            setVisible(true);

                            System.out.println("Data inserted");
                            dispose();

                        }



                    }
                    //dispose();

                }


                catch(Exception e){
                    System.out.println(e);
                }
            }
        });

    }



    public static void main(String[] args) {
        new booking();
    }
}
