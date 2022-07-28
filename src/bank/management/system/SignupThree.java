
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{
    JButton finish;
    String accountNumber,pinNumber;
    String formno;
    SignupThree(String formno){
        
        this.formno = formno;
        setLayout(null);
        setTitle("Post Signup Details");
        setSize(700,600);
        setLocation(350,100);
        setVisible(true);
        
        
        JLabel l1 = new JLabel("Account Details");
        l1.setFont(new Font("railway",Font.BOLD, 22));
        l1.setBounds(250,40,400,40);
        add(l1);
        
        
        Random random = new Random();
        accountNumber = ""+Math.abs(13450000+random.nextLong(10000));//account number will start with 345789
    
        pinNumber = ""+Math.abs(random.nextLong(10000));
     
        
        
        JLabel account = new JLabel("Account Number : " + accountNumber );
        account.setFont(new Font("Railway",Font.BOLD,20));
        account.setBounds(120,200,2000,20);
        add(account);
        
        JLabel pin = new JLabel("Pin Number : " + pinNumber );
        pin.setFont(new Font("Railway",Font.BOLD,20));
        pin.setBounds(120,300,2000,20);
        add(pin);
        
        
        
        
        
        
        finish = new JButton("Finish");
        finish.setBackground(Color.BLACK);
        finish.setForeground(Color.WHITE);
        finish.setFont(new Font("Railway",Font.BOLD,14));
        finish.setBounds(400, 450, 100, 30);
        finish.addActionListener(this);
        add(finish);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==finish){
            String accNo = accountNumber;
            String pinNo = pinNumber;
            
            try{
                Cons con = new Cons();
                String query = "insert into login values('"+formno+"','"+accNo+"', '"+pinNo+"')";
                con.s.executeUpdate(query);
                
                JOptionPane.showMessageDialog(null,"Account created successfully. Enter some amount to deposit.");
                setVisible(false);
                new Deposit(pinNumber).setVisible(true);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args){
        new SignupThree("");
    }
}
