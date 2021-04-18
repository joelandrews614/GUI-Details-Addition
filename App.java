
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.*;    


class App extends JFrame implements ActionListener{
    
    JButton button1;
 
    JTextField text1; //Age
    JTextField text2; //Name
 
    JTextField text3; //Number1
    JTextField text4; //Number2

    JLabel label1; //Name
    JLabel label2; //Age
    JLabel label3; //Details
    JLabel label4; //Details: Result
    
    JLabel label5; //Number1
    JLabel label6; //Number2
    JLabel label7; //Result: Number1 + Number2

    public App(){

        label1 = new JLabel("Name: ");
        label2 = new JLabel("Age: ");
        label3 = new JLabel("Details: ");
        label4 = new JLabel();
        label5 = new JLabel("Number1: ");
        label6 = new JLabel("Number2: ");
        label7 = new JLabel();

        button1 = new JButton("Click Me!!!!");
 
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();

        label1.setBounds(120,120, 300, 20);
        text1.setBounds(170, 120, 100, 20);

        label2.setBounds(120, 150, 300, 20);
        text2.setBounds(170, 150, 100, 20);

        button1.setBounds(170,270,100,20);  
        button1.addActionListener(this);

        label3.setBounds(100, 340,300,20);
        label4.setBounds(160, 330, 300, 20);

        label5.setBounds(100, 200, 300,20);
        text3.setBounds(170, 200, 100, 20);

        label6.setBounds(100, 230, 300, 20);
        text4.setBounds(170, 230, 100, 20);

        label7.setBounds(190, 350, 300, 20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setResizable(false);
        setTitle("Joel's App");
        setLayout(null);

        
        add(label1);
        add(text1);
        add(label2);
        add(text2);
        add(button1);
        add(label3);
        add(label4);
        add(label5);
        add(text3);
        add(label6);
        add(text4);
        add(label7);
    }

    public void actionPerformed(ActionEvent e){
        try{

            String name = text1.getText();
            String age = text2.getText();
            
            String num1 = text3.getText();
            String num2 = text4.getText();

            int num_1 = Integer.parseInt(num1);
            int num_2 = Integer.parseInt(num2);

            label4.setText("Name: " + name + ",  Age: " + age);

            label7.setText(num1 + " + " + num2 + " = " + (num_1 + num_2));
        }catch(Exception ex){
            System.out.println("Exception: " + ex);
        }
    }
}