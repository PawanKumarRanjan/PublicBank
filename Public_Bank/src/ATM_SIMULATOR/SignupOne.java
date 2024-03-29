package ATM_SIMULATOR;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addTextField, cityTextField, stateTextField, pinTextField; 
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;
	SignupOne()
	{
		setLayout(null);
		
		Random ran=new Random();
		random=(Math.abs(ran.nextLong()%9000L)+1000L);
		
		JLabel formno=new JLabel("APPLICATION FORM NO. "+random);
		formno.setFont(new Font("Raleway", Font.BOLD,38));
		formno.setBounds(140,20,600,40);  //set bounds only works when seLayout is null
		add(formno);
		
		JLabel personalDetails=new JLabel("Page 1: Personal Details");
		personalDetails.setFont(new Font("Raleway", Font.BOLD,22));
		personalDetails.setBounds(290,80,400,30);  //set bounds only works when seLayout is null
		add(personalDetails);
		
		JLabel name=new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD,20));
		name.setBounds(100,140,100,30);  //set bounds only works when seLayout is null
		add(name);
		nameTextField=new JTextField();
		nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
		nameTextField.setBounds(300,140,400,30);
		add(nameTextField);
		
		JLabel fname=new JLabel("Father's Name:");
		fname.setFont(new Font("Raleway", Font.BOLD,20));
		fname.setBounds(100,190,200,30);  //set bounds only works when seLayout is null
		add(fname);
		fnameTextField=new JTextField();
		fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
		fnameTextField.setBounds(300,190,400,30);
		add(fnameTextField);
		
		JLabel dob=new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway", Font.BOLD,20));
		dob.setBounds(100,240,200,30);  //set bounds only works when seLayout is null
		add(dob);
		dateChooser=new JDateChooser();
		dateChooser.setBounds(300,240,400,30);
		dateChooser.setForeground(new Color(105,105,105));
		add(dateChooser);
		
		JLabel gen=new JLabel("Gender:");
		gen.setFont(new Font("Raleway", Font.BOLD,20));
		gen.setBounds(100,290,200,30);  //set bounds only works when seLayout is null
		add(gen);
		male= new JRadioButton("Male");
		male.setBounds(300,290,60,30);
		male.setBackground(Color.pink);
		add(male);
		female= new JRadioButton("Female");
		female.setBounds(450,290,70,30);
		female.setBackground(Color.pink);
		add(female);
		other= new JRadioButton("Other");
		other.setBounds(600,290,70,30);
		other.setBackground(Color.pink);
		add(other);
		ButtonGroup gendergroup=new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		gendergroup.add(other);
		
		JLabel email=new JLabel("Email:");
		email.setFont(new Font("Raleway", Font.BOLD,20));
		email.setBounds(100,340,200,30);  //set bounds only works when seLayout is null
		add(email);
		emailTextField=new JTextField();
		emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
		emailTextField.setBounds(300,340,400,30);
		add(emailTextField);
		
		JLabel marital=new JLabel("Marital Status:");
		marital.setFont(new Font("Raleway", Font.BOLD,20));
		marital.setBounds(100,390,200,30);  //set bounds only works when seLayout is null
		add(marital);
		married= new JRadioButton("Married");
		married.setBounds(300,390,100,30);
		married.setBackground(Color.pink);
		add(married);
		unmarried= new JRadioButton("Unmarried");
		unmarried.setBounds(450,390,90,30);
		unmarried.setBackground(Color.pink);
		add(unmarried);
		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		
		JLabel address=new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD,20));
		address.setBounds(100,440,200,30);  //set bounds only works when seLayout is null
		add(address);
		addTextField=new JTextField();
		addTextField.setFont(new Font("Raleway", Font.BOLD,14));
		addTextField.setBounds(300,440,400,30);
		add(addTextField);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD,20));
		city.setBounds(100,490,200,30);  //set bounds only works when seLayout is null
		add(city);
		cityTextField=new JTextField();
		cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
		cityTextField.setBounds(300,490,400,30);
		add(cityTextField);
		
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD,20));
		state.setBounds(100,540,200,30);  //set bounds only works when seLayout is null
		add(state);
		stateTextField=new JTextField();
		stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
		stateTextField.setBounds(300,540,400,30);
		add(stateTextField);
		
		JLabel pincode=new JLabel("Pin Code:");
		pincode.setFont(new Font("Raleway", Font.BOLD,20));
		pincode.setBounds(100,590,200,30);  //set bounds only works when seLayout is null
		add(pincode);
		pinTextField=new JTextField();
		pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
		pinTextField.setBounds(300,590,400,30);
		add(pinTextField);
		
		next=new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway", Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		
		
		getContentPane().setBackground(Color.pink);
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String formno=""+random; //long concatenated
		String name=nameTextField.getText();//get values
		String fname=fnameTextField.getText();
		String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
		
		String gender=null;
		if(male.isSelected())
		{
			gender="Male";
		}
		else if(female.isSelected())
		{
			gender="Female";
		}
		else if(other.isSelected())
		{
			gender="Other";
		}
		
		String email=emailTextField.getText();
		
		String marital=null;
		if(married.isSelected())
		{
			marital="Married";
		}
		else if(unmarried.isSelected())
		{
			marital="Unmarried";
		}
		
		String address=addTextField.getText();
		String city=cityTextField.getText();
		String state=stateTextField.getText();
		String pincode=pinTextField.getText();
		
		try
		{
			if(name.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Name is required");
			}
			else
			{
				Conn c = new Conn();
				String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
				c.s.executeUpdate(query);
				
				setVisible(false);
				new SignupTwo(formno).setVisible(true);
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		new SignupOne();
	}
}