
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener {
        JTextField aadharText,panText;
        JComboBox incomeval,categoryval,eduValue,occupationValue;
        JButton submit,cancel;
        JRadioButton senYes,senNo;
        String formno;
    SignupTwo(String formno){
 
        this.formno = formno;
        setLayout(null);
        
        setTitle("Sign Up,    Page 2 of 2");
        
        
        
        
        JLabel AdditionalDetails = new JLabel("Page 2: Additional Details" );
        AdditionalDetails.setFont(new Font("Railway",Font.BOLD,28));
        AdditionalDetails.setBounds(230,70,400,40);
        add(AdditionalDetails);
        
        
        
        //Labels and textfields
        
        
        
        JLabel income = new JLabel("Income :" );
        income.setFont(new Font("Railway",Font.BOLD,20));
        income.setBounds(120,160,200,30);
        add(income);
        
        String valIncome[] = {"Null","< 1,00,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incomeval = new JComboBox(valIncome);
        incomeval.setFont(new Font("Railway",Font.BOLD,14));
        incomeval.setBounds(300,160,400,30);
        add(incomeval);
        
        
        
        
        JLabel category = new JLabel("Category :" );
        category.setFont(new Font("Railway",Font.BOLD,20));
        category.setBounds(120,230,200,30);
        add(category);
        String valcategory[] = {"Other","General","OBC","SC","ST"};
        categoryval = new JComboBox(valcategory);
        categoryval.setFont(new Font("Railway",Font.BOLD,14));
        categoryval.setBounds(300,230,400,30);
        add(categoryval);
        
        
        
        
        JLabel education = new JLabel("Educational" );
        education.setFont(new Font("Railway",Font.BOLD,20));
        education.setBounds(120,300,200,30);
        add(education);
        JLabel qualification = new JLabel("Qualification :" );
        qualification.setFont(new Font("Railway",Font.BOLD,20));
        qualification.setBounds(120,327,200,30);
        add(qualification);
        String valEducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrates","Others"};
        eduValue = new JComboBox(valEducation);
        eduValue.setFont(new Font("Railway",Font.BOLD,14));
        eduValue.setBounds(300,310,400,30);
        add(eduValue);
        
        
        
        
        JLabel occupation = new JLabel("Occupation :" );
        occupation.setFont(new Font("Railway",Font.BOLD,20));
        occupation.setBounds(120,380,200,30);
        add(occupation);
        String valOccupation[] = {"Self-Employed","Salaried","Student","Business","Student","Other"};
        occupationValue = new JComboBox(valOccupation);
        occupationValue.setFont(new Font("Railway",Font.BOLD,14));
        occupationValue.setBounds(300,380,400,30);
        add(occupationValue);
        
        
        
        
        JLabel Senior = new JLabel("Senior Citizen :" );
        Senior.setFont(new Font("Railway",Font.BOLD,20));
        Senior.setBounds(120,450,200,30);
        add(Senior);
        
        senYes = new JRadioButton("Yes");
        senYes.setFont(new Font("Railway",Font.BOLD,15));
        senYes.setBackground(Color.GRAY);
        senYes.setBounds(300,450,60,30);
        add(senYes);
        senNo = new JRadioButton("No");
        senNo.setFont(new Font("Railway",Font.BOLD,15));
        senNo.setBackground(Color.GRAY);
        senNo.setBounds(450,450,85,30);
        add(senNo);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(senYes);
        genderGroup.add(senNo);
        
        
        
        
        JLabel aadhar = new JLabel("Aadhar Number :" );
        aadhar.setFont(new Font("Railway",Font.BOLD,20));
        aadhar.setBounds(120,520,200,30);
        add(aadhar);
        aadharText = new JTextField();
        aadharText.setFont(new Font("Railway",Font.BOLD,14));
        aadharText.setBounds(300,520,400,30);
        add(aadharText);
        
     
        
        
        
        JLabel pan = new JLabel("PAN Number :" );
        pan.setFont(new Font("Railway",Font.BOLD,20));
        pan.setBounds(120,600,200,30);
        add(pan);
        panText = new JTextField();
        panText.setFont(new Font("Railway",Font.BOLD,14));
        panText.setBounds(300,600,400,30);
        add(panText);
        
        
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Railway",Font.BOLD,14));
        cancel.setBounds(470, 690, 100, 30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        
        
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Railway",Font.BOLD,14));
        submit.setBounds(600, 690, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(850,800);
        setLocation(350,100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
        else if(ae.getSource() == submit){
            String income = (String) incomeval.getSelectedItem(); // random is a long value
            String category =(String) categoryval.getSelectedItem();
            String edu = (String) eduValue.getSelectedItem();
            String occupation = (String) occupationValue.getSelectedItem();
            String senior = null;
            if(senYes.isSelected()){
                senior = "Male";
            }
            else if(senNo.isSelected()){
                senior = "Female";
            }
        
        
            String aadhar = aadharText.getText();
            String pan = panText.getText();
        
        
        
            try{
            
                //checking inputs: here
                if(senior.equals("")){
                    JOptionPane.showMessageDialog(null,"Select Senior Citizen Option");
                }
                else if(aadhar.equals("")){
                    JOptionPane.showMessageDialog(null,"Aadhar is Required");
                }
                else if(pan.equals("")){
                    JOptionPane.showMessageDialog(null,"PAN is Required");
                }
            
                else{
                    Cons c = new Cons();
                    String query = "insert into signuptwo value('"+formno+"', '"+income+"'  ,'"+category+"' , '"+edu+"' , '"+occupation+"' , '"+senior+"' , '"+aadhar+"' , '"+pan+"')";
                    c.s.executeUpdate(query);
               
                    setVisible(false);
                    new SignupThree(formno).setVisible(true);
                }
            }
        
             /*
            variable here shoulb be treated as string 
            therefore, tomake query using a variable we have to do in the format-
            "string'"+variable"'String";
            */
             catch(Exception e){
                System.out.println(e);
            }
        }
            
        
        
    }
    
    
    
    public static void main(String args[]){
        new SignupTwo("");
    
    
    }
    
}
