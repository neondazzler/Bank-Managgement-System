
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.regex.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;



public class Signup extends JFrame implements ActionListener {
    
    long random;
    JTextField nameText,fnameText,dobText,emailText,addressText,cityText,stateText,pinText;
    JButton next;
    JRadioButton male, female, other , married, unmarried;
    JDateChooser dateChooser;
    Signup(){
        
        
        
        setLayout(null);
        
        setTitle("Sign Up,    Page 1 of 2");
        
        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L)+1000L);//to get 4 digit application number
        
        JLabel formno = new JLabel("Applicaion Form Number :"+ random );
        formno.setFont(new Font("Railway",Font.BOLD,30));
        formno.setBounds(190,20,600,30);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1: Personal Details" );
        personalDetails.setFont(new Font("Railway",Font.BOLD,28));
        personalDetails.setBounds(230,70,400,40);
        add(personalDetails);
        
        
        
        //Labels and textfields
        
        
        
        JLabel name = new JLabel("Name :" );
        name.setFont(new Font("Railway",Font.BOLD,20));
        name.setBounds(120,150,200,30);
        add(name);
        nameText = new JTextField();
        nameText.setFont(new Font("Railway",Font.BOLD,14));
        nameText.setBounds(300,150,400,30);
        add(nameText);
        
        
        
        
        JLabel fname = new JLabel("Father's Name :" );
        fname.setFont(new Font("Railway",Font.BOLD,20));
        fname.setBounds(120,200,200,30);
        add(fname);
        fnameText = new JTextField();
        fnameText.setFont(new Font("Railway",Font.BOLD,14));
        fnameText.setBounds(300,200,400,30);
        add(fnameText);
        
        
        
        
        
        JLabel dobText = new JLabel("Date of Birth :" );
        dobText.setFont(new Font("Railway",Font.BOLD,20));
        dobText.setBounds(120,250,200,30);
        add(dobText);
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,250,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        
        
        
        JLabel gender = new JLabel("Gender :" );
        gender.setFont(new Font("Railway",Font.BOLD,20));
        gender.setBounds(120,300,200,30);
        add(gender);
        male = new JRadioButton("Male");
        male.setFont(new Font("Railway",Font.BOLD,15));
        male.setBackground(Color.GRAY);
        male.setBounds(300,300,60,30);
        add(male);
        female = new JRadioButton("Female");
        female.setFont(new Font("Railway",Font.BOLD,15));
        female.setBackground(Color.GRAY);
        female.setBounds(450,300,85,30);
        add(female);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        
        
        
        
        JLabel email = new JLabel("Email :" );
        email.setFont(new Font("Railway",Font.BOLD,20));
        email.setBounds(120,350,200,30);
        add(email);
        emailText = new JTextField();
        emailText.setFont(new Font("Railway",Font.BOLD,14));
        emailText.setBounds(300,350,400,30);
        add(emailText);
        
        
        
        
        
        JLabel marital = new JLabel("Marital Status :" );
        marital.setFont(new Font("Railway",Font.BOLD,20));
        marital.setBounds(120,400,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setFont(new Font("Railway",Font.BOLD,15));
        married.setBackground(Color.GRAY);
        married.setBounds(300,400,100,30);
        add(married);
        unmarried = new JRadioButton("Unmarried");
        unmarried.setFont(new Font("Railway",Font.BOLD,15));
        unmarried.setBackground(Color.GRAY);
        unmarried.setBounds(430,400,160,30);
        add(unmarried);
        other = new JRadioButton("Other");
        other.setFont(new Font("Railway",Font.BOLD,15));
        other.setBackground(Color.GRAY);
        other.setBounds(590,400,200,30);
        add(other);
        
        ButtonGroup marryGroup = new ButtonGroup();
        marryGroup.add(married);
        marryGroup.add(unmarried);
        marryGroup.add(other);
        
        
        
        
        
        
        JLabel address = new JLabel("Adddress :" );
        address.setFont(new Font("Railway",Font.BOLD,20));
        address.setBounds(120,450,200,30);
        add(address);
        addressText = new JTextField();
        addressText.setFont(new Font("Railway",Font.BOLD,14));
        addressText.setBounds(300,450,400,30);
        add(addressText);
        
        
        
        
        
        
        JLabel city = new JLabel("City :" );
        city.setFont(new Font("Railway",Font.BOLD,20));
        city.setBounds(120,500,200,30);
        add(city);
        cityText = new JTextField();
        cityText.setFont(new Font("Railway",Font.BOLD,14));
        cityText.setBounds(300,500,400,30);
        add(cityText);
        
        
        
        
        
        
        JLabel state = new JLabel("State :" );
        state.setFont(new Font("Railway",Font.BOLD,20));
        state.setBounds(120,550,200,30);
        add(state);
        stateText = new JTextField();
        stateText.setFont(new Font("Railway",Font.BOLD,14));
        stateText.setBounds(300,550,400,30);
        add(stateText);
        
        
        
        
        
        JLabel pincode = new JLabel("Pincode :" );
        pincode.setFont(new Font("Railway",Font.BOLD,20));
        pincode.setBounds(120,600,200,30);
        add(pincode);
        pinText = new JTextField();
        pinText.setFont(new Font("Railway",Font.BOLD,14));
        pinText.setBounds(300,600,400,30);
        add(pinText);

        
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway",Font.BOLD,14));
        next.setBounds(600, 690, 100, 30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(850,800);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno = ""+ random; // random is a long value
        String name  = nameText.getText();
        String fname = fnameText.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if(female.isSelected()){
            gender = "Female";
        }
        
        
        
        
        String marital = null;
        if(married.isSelected()){
            marital = "Mrried";
        }
        else if(unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if(other.isSelected()){
            marital = "Other";
        }
        
        String address = addressText.getText();
        String city = cityText.getText();
        String state = stateText.getText();
        String pin = pinText.getText();
        
        
        
        try{
            
            //checking inputs: here
            //To Check the Format of Name Field
            
            String regex_name = "[a-zA-Z]+";  // Regular Expression to check the format of the email
            Pattern pattern_name =Pattern.compile(regex_name);
            Matcher match_name= pattern_name.matcher(name); // Mathching the Entered email with the regex
            boolean name_match= match_name.matches(); // Transfering the result to a boolean variable
            // Check of Email Field Ends Here
            
            
            //To Check the Format of Email Field
            String email = emailText.getText();
            String regex_email = "^(.+)@(.+)$";  // Regular Expression to check the format of the email
            Pattern pattern_email =Pattern.compile(regex_email);
            Matcher match_email= pattern_email.matcher(email); // Mathching the Entered email with the regex
            boolean email_match= match_email.matches(); // Transfering the result to a boolean variable
            // Check of Email Field Ends Here
            
            
            if(name_match == false){
                JOptionPane.showMessageDialog(null,"Invalid Name");
            }
            else if(fname.equals("")){
                JOptionPane.showMessageDialog(null,"Father's Name is Required");
            }
            else if(dob.equals("")){
                JOptionPane.showMessageDialog(null,"Enter DOB");
            }
            else if(gender.equals("")){
                JOptionPane.showMessageDialog(null,"Select Gender");
            }
            else if(email_match == false){
                JOptionPane.showMessageDialog(null,"Incorrect Email Format");
            }
            else if(marital.equals("")){
                JOptionPane.showMessageDialog(null,"Select a Marital Status");
            }
            else if(address.equals("")){
                JOptionPane.showMessageDialog(null,"Address is Required");
            }
            else if(city.equals("")){
                JOptionPane.showMessageDialog(null,"City is Required");
            }
            else if(state.equals("")){
                JOptionPane.showMessageDialog(null,"State is Required");
            }else if(pin.equals("")){
                JOptionPane.showMessageDialog(null,"Pin is Required");
            }
            
            else{
               Cons c = new Cons();
               String query = "insert into signup value('"+formno+"'  ,'"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' , '"+email+"' , '"+marital+"' , '"+address+"' , '"+city+"' , '"+pin+"' , '"+state+"')";
               c.s.executeUpdate(query);
               
               
               setVisible(false);
               new SignupTwo(formno).setVisible(true);
            
            }
             /*
            variable here shoulb be treated as string 
            therefore, tomake query using a variable we have to do in the format-
            "string'"+variable"'String";
            */
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        
    }
    
    
    
    public static void main(String args[]){
        new Signup();
    
    
    }
    
}
