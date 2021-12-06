import com.mongodb.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;



public class signup extends JFrame {
    public signup(){

        JLabel imgbus = new JLabel(new ImageIcon("D:\\5th\\ADBMS\\mini project\\bus1.png"));
        imgbus.setBounds(0,-170,160,470);
        add(imgbus);
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bus1.png"));
//        Image i2 = i1.getImage();
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l14 = new JLabel(i3);
//        l14.setBounds(0,-170,160,470);
//        add(l14);
//
        JLabel imgbus2 = new JLabel(new ImageIcon("D:\\5th\\ADBMS\\mini project\\bus.png"));
        imgbus2.setBounds(1070,-170,160,470);
        add(imgbus2);
//        ImageIcon m1 = new ImageIcon(ClassLoader.getSystemResource("bus.png"));
//        Image m2 = m1.getImage();
//        ImageIcon m3 = new ImageIcon(m2);
//        JLabel m14 = new JLabel(m3);
//        m14.setBounds(1070,-170,160,470);
//        add(m14);

        //setTitle("ADMIN LOGIN.");
        JLabel l1 = new JLabel("                    MAHARASHTRA STATE BOARD TRANSPORT CORPORATION ");
        l1.setFont(new Font("Raleway", Font.BOLD, 30));
        l1.setBounds(0,0,1250,135);
        l1.setForeground(Color.white);
        l1.setBackground(Color.DARK_GRAY);
        l1.setAlignmentX(CENTER_ALIGNMENT);
        l1.setOpaque(true);
        add(l1);

        JLabel l2 = new JLabel("                                                 Welcome to Online bus ticket booking system     ");
        l2.setFont(new Font("Raleway", Font.BOLD, 25));
        l2.setBounds(0,130,1250,65);
        l2.setForeground(Color.MAGENTA);
        l2.setBackground(Color.LIGHT_GRAY);
        l2.setAlignmentX(CENTER_ALIGNMENT);
        l2.setOpaque(true);
        add(l2);
//
       JLabel imgbu = new JLabel(new ImageIcon("D:\\5th\\ADBMS\\mini project\\bus7.png"));
       imgbu.setBounds(10,185,660,470);
       add(imgbu);
//        ImageIcon p1 = new ImageIcon(ClassLoader.getSystemResource("bus7.png"));
//        Image p2 = p1.getImage();
//        ImageIcon p3 = new ImageIcon(p2);
//        JLabel p14 = new JLabel(p3);
//        p14.setBounds(10,185,660,470);
//        add(p14);




        //setTitle("ADMIN LOGIN.");
        JLabel l10 = new JLabel("                   MAHARASHTRA STATE BOARD TRANSPORT CORPORATION ");
        l10.setFont(new Font("Raleway", Font.BOLD, 30));
        l10.setBounds(0,0,1250,135);
        l10.setForeground(Color.white);
        l10.setBackground(Color.DARK_GRAY);
        l10.setAlignmentX(CENTER_ALIGNMENT);
        l10.setOpaque(true);
        add(l10);

        JLabel l20 = new JLabel("                                                 Welcome to Online bus ticket booking system     ");
        l20.setFont(new Font("Raleway", Font.BOLD, 25));
        l20.setBounds(0,130,1250,65);
        l20.setForeground(Color.MAGENTA);
        l20.setBackground(Color.LIGHT_GRAY);
        l20.setAlignmentX(CENTER_ALIGNMENT);
        l20.setOpaque(true);
        add(l20);





        JLabel l5 = new JLabel(" REGISTER");
        l5.setFont(new Font("Raleway", Font.BOLD, 25));
        l5.setBounds(860,210,150,45);
        l5.setForeground(Color.DARK_GRAY);
        l5.setBackground(Color.CYAN);
        l5.setAlignmentX(CENTER_ALIGNMENT);
        l5.setOpaque(true);
        add(l5);


        /*register*/
        Label lb9 = new Label("USERNAME      :");
        lb9.setFont(new Font("Osward", Font.BOLD, 20));
        lb9.setBounds(720,320,200,30);
        add(lb9);

        JTextField rusername = new JTextField(20);
        rusername.setFont(new Font("Arial", Font.BOLD, 10));
        rusername.setBounds(920,320,230,30);
        add(rusername);

        JLabel  s2= new JLabel("GENGER: ");
        s2.setFont(new Font("Osward",Font.BOLD,20));
        s2.setBounds(720,370,200,30);
        add(s2);

        String[] gn = {"male", "female"};
        JComboBox Gender = new JComboBox(gn);
        Gender.setBounds(920,370,230,30);
        add(Gender);


        JLabel lb4 = new JLabel("EMAIL               :");
        lb4.setFont(new Font("Osward", Font.BOLD, 20));
        lb4.setBounds(720,420,200,30);
        add(lb4);

        JTextField email = new JTextField(20);
        email.setFont(new Font("Arial", Font.BOLD, 10));
        email.setBounds(920,420,230,30);
        add(email);

        Label lb5 = new Label("PHONE NO.      :");
        lb5.setFont(new Font("Osward", Font.BOLD, 20));
        lb5.setBounds(720,470,200,30);
        add(lb5);

        JTextField Phone = new JTextField(20);
        Phone.setFont(new Font("Arial", Font.BOLD, 10));
        Phone.setBounds(920,470,230,30);
        Phone.addKeyListener(new KeyAdapter(){
                        public void keyPressed(KeyEvent e){

                char ch = e.getKeyChar();
                if(Character.isDigit(ch)){
                }
                else{
                    JOptionPane.showMessageDialog(null, "Only numbers are allowed!");
                    Phone.setText(" ");
                }
            }
        });
        add(Phone);

        JLabel lb6 = new JLabel("PASSWORD      :");
        lb6.setFont(new Font("Osward", Font.BOLD, 20));
        lb6.setBounds(720,520,200,30);
        add(lb6);

        JPasswordField rpassword = new JPasswordField(20);
        rpassword.setFont(new Font("Arial", Font.BOLD, 10));
        rpassword.setBounds(920,520,230,30);
        add(rpassword);

        JButton register = new JButton("REGISTER");
        register.setFont(new Font("Arial", Font.BOLD, 14));
        register.setBounds(710,595,120,30);
        register.setBackground(Color.BLACK);
        register.setForeground(Color.orange);
        add(register);

        JButton delete = new JButton("DELETE");
        delete.setFont(new Font("Arial", Font.BOLD, 14));
        delete.setBounds(840,595,100,30);
        delete.setBackground(Color.BLACK);
        delete.setForeground(Color.ORANGE);

        add(delete);

        JButton update = new JButton("UPDATE");
        update.setFont(new Font("Arial", Font.BOLD, 14));
        update.setBounds(950,595,100,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.ORANGE);

        add(update);

        JButton next = new JButton("Go next");
        next.setFont(new Font("Arial", Font.BOLD, 14));
        next.setBounds(1060,595,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.ORANGE);

        add(next);






        JButton exi = new JButton("exit");
        add(exi);


        setVisible(true);
        setLayout(null);

        setSize(1250,700);
        setLocation(220,50);

        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                booking sa = new booking();
                setVisible(true);
                dispose();
            }
        });

        register.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    /** Connect to MongoDB **/
                    // uses MongoClient
                    MongoClient mongo = new MongoClient("localhost", 27017);

                    /** Get database **/
                    // if database doesn't exists, MongoDB will create it for you
                    DB db = mongo.getDB("pvg");

                    /** Get collection / table from 'testdb' **/
                    // if collection doesn't exists, MongoDB will create it for you
                    DBCollection table = db.getCollection("registration");


                    //Insert Document
                    BasicDBObject document = new BasicDBObject();

                    int flag = 0;

                        if(ae.getSource()==register)
                        {
                            String s1= rusername.getText();
                            Object s2= Gender.getSelectedItem();
                            String s3= email.getText();
                            String s4= Phone.getText();
                            String s5= rpassword.getText();

                            //checking whether username is not empty
                            if(s1.isEmpty()==true){
                                JOptionPane.showMessageDialog(register,"Please enter an username");
                                flag = 0;
                            }else{
                                flag = 1;
                                document.put("username", s1);
                            }

                            //email validation
                            String emailFormate ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
                            Pattern p = Pattern.compile(emailFormate);

                            System.out.println("email " + p.matcher(s3).matches());
                            if(p.matcher(s3).matches()==true){
                                document.put("email", s3);
                                flag = 1;
                            }
                            else{
                                JOptionPane.showMessageDialog(register,"Please enter valid mail");
                                email.setText(" ");
                                flag = 0;

                            }

                            //checking whether Phone no is not empty
                            if(s4.isEmpty()==true){
                                JOptionPane.showMessageDialog(register,"Please enter an phone no");
                                flag = 0;
                            }else{
                                flag = 1;
                                document.put("Phone_no", s4);
                            }

                            //checking whether password is not empty
                            if(s5.isEmpty()==true){
                                JOptionPane.showMessageDialog(register,"Please enter an password");
                                flag = 0;
                            }else{
                                flag = 1;
                                document.put("password", s5);

                            }









                        if(flag == 1){
                            table.insert(document);
                            JOptionPane.showMessageDialog(null,"your account created successfully");

                            System.out.println("Data inserted");
                            flag = 1;
                            //dispose();
                        }




                    }


                }

               catch(Exception e){
                    System.out.println(e);
                }
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    /** Connect to MongoDB **/
                    // uses MongoClient
                    MongoClient mongo = new MongoClient("localhost", 27017);

                    /** Get database **/
                    // if database doesn't exists, MongoDB will create it for you
                    DB db = mongo.getDB("pvg");

                    /** Get collection / table from 'testdb' **/
                    // if collection doesn't exists, MongoDB will create it for you
                    DBCollection table = db.getCollection("registration");



                    if (ae.getSource()==delete)
                    {

                        String s1=rusername.getText();
                        BasicDBObject deleteQuery = new BasicDBObject();
                        deleteQuery.put( "username" , s1);
                        DBCursor cursor = table.find(deleteQuery);
                        while (cursor.hasNext())
                        {
                            DBObject item = cursor.next();
                            table.remove(item);
                        }
                        System.out.println("Data Deleted");
                        JOptionPane.showMessageDialog(null,"your account deleted successfully");

                    }

                }


                catch(Exception e){
                    System.out.println(e);
                }
            }
        });

        update.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {

                    /** Connect to MongoDB **/
                    // uses MongoClient
                    MongoClient mongo = new MongoClient("localhost", 27017);

                    /** Get database **/
                    // if database doesn't exists, MongoDB will create it for you
                    DB db = mongo.getDB("pvg");

                    /** Get collection / table from 'testdb' **/
                    // if collection doesn't exists, MongoDB will create it for you
                    DBCollection table = db.getCollection("registration");


                    //Update Document
                    if(ae.getSource()==update)
                    {

                        String s1=rusername.getText();
                        Object s2=Gender.getSelectedItem();
                        String s3=email.getText();
                        String s4=Phone.getText();
                        String s5=rpassword.getText();



                        BasicDBObject newDocument = new BasicDBObject();
                        newDocument.append("username", s1);
                        newDocument.append("Gender", s2);
                        newDocument.append("email", s3);
                        newDocument.append("Phone_no", s4);
                        newDocument.append("password", s5);



                        BasicDBObject searchQuery = new BasicDBObject();
                        searchQuery.append("username", s1);


                        table.update(searchQuery, newDocument);

                        System.out.println("Data updated");
                        JOptionPane.showMessageDialog(null,"your account updated successfully");
                    }

                }


                catch(Exception e){
                    System.out.println(e);
                }
            }
        });

    }



    public static void main(String[] args) {
        new signup();
    }
}

