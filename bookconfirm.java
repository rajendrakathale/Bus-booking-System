import com.mongodb.*;
import org.bson.types.ObjectId;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
;

public class bookconfirm extends JFrame {
    public bookconfirm(){

        JLabel l2 = new JLabel("      BOOKING CONFIRMATION     ");
        l2.setFont(new Font("Raleway", Font.BOLD, 35));
        l2.setBounds(0,10,1250,65);
        l2.setForeground(Color.MAGENTA);
        l2.setBackground(Color.LIGHT_GRAY);
        l2.setAlignmentX(CENTER_ALIGNMENT);
        l2.setOpaque(true);
        add(l2);

        JLabel l1 = new JLabel("Booking ID : ");
        l1.setFont(new Font("Raleway", Font.BOLD, 25));
        l1.setBounds(30,95,180,40);
        l1.setForeground(Color.black);
        l1.setOpaque(true);
        add(l1);

        //for displaying _id as booking id
        JTextField bookingid = new JTextField(20);
        bookingid.setFont(new Font("Arial", Font.BOLD, 25));
        bookingid.setBounds(220,95,250,40);
        bookingid.setBorder(BorderFactory.createLineBorder(Color.white,0));
        bookingid.setOpaque(false);
        add(bookingid);

        JLabel l4 = new JLabel("");
        l4.setFont(new Font("Raleway", Font.BOLD, 25));
        l4.setBounds(620,135,2,440);
        l4.setBackground(Color.black);
        l4.setOpaque(true);
        add(l4);

        JLabel l5 = new JLabel("Trip Details");
        l5.setFont(new Font("Raleway", Font.BOLD, 28));
        l5.setBounds(50,155,180,40);
        l5.setForeground(Color.black);
        l5.setBackground(Color.cyan);
        l5.setOpaque(true);
        add(l5);

        //for displaying from
        JLabel l6 = new JLabel("From : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(70,225,90,40);
        l6.setForeground(Color.black);
        l6.setOpaque(true);
        add(l6);

        JTextField from = new JTextField(20);
        from.setFont(new Font("Arial", Font.BOLD, 20));
        from.setBounds(180,225,120,40);
        from.setBorder(BorderFactory.createLineBorder(Color.black,0));
        from.setOpaque(false);
        add(from);


        JLabel l7 = new JLabel(" To :");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(350,225,60,40);
        l7.setForeground(Color.black);
        l7.setOpaque(true);
        add(l7);

        //for displaying to
        JTextField to = new JTextField(20);
        to.setFont(new Font("Arial", Font.BOLD, 20));
        to.setBounds(420,225,120,40);
        to.setBorder(BorderFactory.createLineBorder(Color.black,0));
        to.setOpaque(false);
        add(to);

        JLabel l8 = new JLabel("Date : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(70,305,150,40);
        l8.setForeground(Color.black);
        l8.setOpaque(true);
        add(l8);

        //for displaying date
        JTextField date = new JTextField(20);
        date.setFont(new Font("Arial", Font.BOLD, 20));
        date.setBounds(220,305,200,40);
        date.setBorder(BorderFactory.createLineBorder(Color.black,0));
        date.setOpaque(false);
        add(date);

        JLabel l9 = new JLabel("Arrival Time : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(70,385,200,40);
        l9.setForeground(Color.black);
        l9.setOpaque(true);
        add(l9);

        JLabel l10 = new JLabel(" 7 AM ");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(270,385,200,40);
        l10.setForeground(Color.black);
        l10.setOpaque(true);
        add(l10);

        JLabel l11 = new JLabel("Number of Seats ->  Adult : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(70,465,280,40);
        l11.setForeground(Color.black);
        l11.setOpaque(true);
        add(l11);

        //for displaying  adult no
        JTextField adult = new JTextField(20);
        adult.setFont(new Font("Arial", Font.BOLD, 20));
        adult.setBounds(350,465,50,40);
        adult.setBorder(BorderFactory.createLineBorder(Color.black,0));
        adult.setOpaque(false);
        add(adult);

        JLabel l12 = new JLabel("Child : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 20));
        l12.setBounds(410,465,70,40);
        l12.setForeground(Color.black);
        l12.setOpaque(true);
        add(l12);

        //for displaying child
        JTextField child = new JTextField(20);
        child.setFont(new Font("Arial", Font.BOLD, 20));
        child.setBounds(490,465,50,40);
        child.setBorder(BorderFactory.createLineBorder(Color.black,0));
        child.setOpaque(false);
        add(child);

        JLabel l13 = new JLabel("Payment Details");
        l13.setFont(new Font("Raleway", Font.BOLD, 28));
        l13.setBounds(650,155,250,40);
        l13.setForeground(Color.black);
        l13.setBackground(Color.cyan);
        l13.setOpaque(true);
        add(l13);

        JLabel l14 = new JLabel("Adult (Rs): ");
        l14.setFont(new Font("Raleway", Font.BOLD, 20));
        l14.setBounds(760,255,120,40);
        l14.setForeground(Color.black);
        l14.setOpaque(true);
        add(l14);

        //for displaying parent amount
        JTextField adultp = new JTextField(20);
        adultp.setFont(new Font("Arial", Font.BOLD, 20));
        adultp.setBounds(900,255,90,40);
        adultp.setBorder(BorderFactory.createLineBorder(Color.black,0));
        adultp.setOpaque(false);
        add(adultp);

        JLabel l15 = new JLabel("Child (Rs): ");
        l15.setFont(new Font("Raleway", Font.BOLD, 20));
        l15.setBounds(760,335,120,40);
        l15.setForeground(Color.black);
        l15.setOpaque(true);
        add(l15);

        //for displaying child amount
        JTextField childp = new JTextField(20);
        childp.setFont(new Font("Arial", Font.BOLD, 20));
        childp.setBounds(900,335,90,40);
        childp.setBorder(BorderFactory.createLineBorder(Color.black,0));
        childp.setOpaque(false);
        add(childp);

        JLabel l17 = new JLabel("");
        l17.setFont(new Font("Raleway", Font.BOLD, 20));
        l17.setBounds(720,395,270,3);
        l17.setBackground(Color.black);
        l17.setOpaque(true);
        add(l17);

        JLabel l16 = new JLabel("Total(Rs) : ");
        l16.setFont(new Font("Raleway", Font.BOLD, 20));
        l16.setBounds(760,415,120,40);
        l16.setForeground(Color.black);
        l16.setOpaque(true);
        add(l16);

        //for displaying total amount
        JTextField total = new JTextField(20);
        total.setFont(new Font("Arial", Font.BOLD, 20));
        total.setBounds(900,415,90,40);
        total.setBorder(BorderFactory.createLineBorder(Color.black,0));
        total.setOpaque(false);
        add(total);


        JButton pay = new JButton("Pay and Confirm");
        pay.setFont(new Font("Arial", Font.BOLD, 20));
        pay.setBounds(980,535,200,40);
        pay.setBackground(Color.BLACK);
        pay.setForeground(Color.ORANGE);
        add(pay);

        JButton update = new JButton("SHOW");
        update.setFont(new Font("Arial", Font.BOLD, 20));
        update.setBounds(650,535,200,40);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.ORANGE);
        add(update);

        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                confirmation sa = new confirmation();
                setVisible(true);
                dispose();
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    /* Connect to MongoDB */
                    // uses MongoClient
                    MongoClient mongo = new MongoClient("localhost", 27017);

                    /* Get database */
                    // if database doesn't exists, MongoDB will create it for you
                    DB db = mongo.getDB("pvg");

                    /* Get collection / table from 'testdb' */
                    // if collection doesn't exists, MongoDB will create it for you
                    DBCollection table = db.getCollection("booking");


                    if(ae.getSource()==update)
                    {
                        // Get all students (no query criteria).
                        DBCursor cursor = table.find();

                        // Iterate over the students.
                        while (cursor.hasNext())
                        {
                            // Display each student.

                            DBObject disp = cursor.next();


                            String i1  = (String)disp.get("FROM : ");
                            String i2 = (String) disp.get("TO : ");
                            String i3 = (String) disp.get("DATE : ");
                            String i4 = (String) disp.get("ADULT : ");
                            String i5 = (String) disp.get("CHILD : ");
                            ObjectId id = (ObjectId) disp.get("_id");

                            int p = Integer.parseInt(i4);
                            int q = p * 250;
                            int r = Integer.parseInt(i5);
                            int s = r * 120;
                            int tot = q + s;


                            from.setText(i1);
                            to.setText(i2);
                            date.setText(i3);
                            adult.setText(i4);
                            child.setText(i5);
                            bookingid.setText(String.valueOf(id));
                            adultp.setText(Integer.toString(q));
                            childp.setText(Integer.toString(s));
                            total.setText(Integer.toString(tot));


                        }




                    }

                }


                catch(Exception e){
                    System.out.println(e);
                }
            }
        });









        JButton exi = new JButton("exit");
        add(exi);

        setVisible(true);
        setLayout(null);

        setSize(1250,700);
        setLocation(500,100);

    }



    public static void main(String[] args) {
        new bookconfirm();
    }
}

