	package ATM_SIMULATOR;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener/*java.awt.event.*;*/{
	
	JRadioButton saving, fixed, current, recurring;
	JCheckBox atm,internet,mobile,sms,cheque,estatement,declaration;
	JButton submit,cancel;
	String formno;
	SignupThree(String formno)
	{
		this.formno=formno;
		setLayout(null);
		
		JLabel l1=new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD, 22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		JLabel type=new JLabel("Account Type:");
		type.setFont(new Font("Raleway",Font.BOLD, 22));
		type.setBounds(100,140,200,30);
		add(type);
		saving=new JRadioButton("Saving Account");
		saving.setFont(new Font("Raleway",Font.BOLD, 16));
		saving.setBackground(Color.pink);
		saving.setBounds(100,180,150,25);
		add(saving);
		fixed=new JRadioButton("Fixed Deposit Account");
		fixed.setFont(new Font("Raleway",Font.BOLD, 16));
		fixed.setBackground(Color.pink);
		fixed.setBounds(350,180,230,25);
		add(fixed);
		current=new JRadioButton("Current Account");
		current.setFont(new Font("Raleway",Font.BOLD, 16));
		current.setBackground(Color.pink);
		current.setBounds(100,220,150,25);
		add(current);
		recurring=new JRadioButton("Recurring Deposit Account");
		recurring.setFont(new Font("Raleway",Font.BOLD, 16));
		recurring.setBackground(Color.pink);
		recurring.setBounds(350,220,230,25);
		add(recurring);
		ButtonGroup groupaccount=new ButtonGroup();
		groupaccount.add(saving);
		groupaccount.add(fixed);
		groupaccount.add(current);
		groupaccount.add(recurring);
		
		JLabel card=new JLabel("Card Number:");
		card.setFont(new Font("Raleway",Font.BOLD, 22));
		card.setBounds(100,300,200,30);
		add(card);
		JLabel number=new JLabel("XXXX-XXXX-XXXX-4169");
		number.setFont(new Font("Raleway",Font.BOLD, 22));
		number.setBounds(330,300,260,30);
		add(number);
		JLabel carddetail=new JLabel("Your 16 Digit Card Number");
		carddetail.setFont(new Font("Raleway",Font.BOLD, 12));
		carddetail.setBounds(100,330,290,15);
		add(carddetail);
		
		JLabel pin=new JLabel("Pin Number:");
		pin.setFont(new Font("Raleway",Font.BOLD, 22));
		pin.setBounds(100,370,200,30);
		add(pin);
		JLabel pnumber=new JLabel("XXXX");
		pnumber.setFont(new Font("Raleway",Font.BOLD, 22));
		pnumber.setBounds(330,370,260,30);
		add(pnumber);
		JLabel pindetail=new JLabel("Your 4 Digit Pin");
		pindetail.setFont(new Font("Raleway",Font.BOLD, 12));
		pindetail.setBounds(100,400,290,15);
		add(pindetail);
		
		JLabel services=new JLabel("Services Required:");
		services.setFont(new Font("Raleway",Font.BOLD, 22));
		services.setBounds(100,450,210,30);
		add(services);
		atm=new JCheckBox("ATM Card");
		atm.setBackground(Color.pink);
		atm.setFont(new Font("Raleway", Font.BOLD, 16));
		atm.setBounds(100,500,200,30);
		add(atm);
		internet=new JCheckBox("Internet Banking");
		internet.setBackground(Color.pink);
		internet.setFont(new Font("Raleway", Font.BOLD, 16));
		internet.setBounds(350,500,200,30);
		add(internet);
		mobile=new JCheckBox("Mobile Banking");
		mobile.setBackground(Color.pink);
		mobile.setFont(new Font("Raleway", Font.BOLD, 16));
		mobile.setBounds(100,550,200,30);
		add(mobile);
		sms=new JCheckBox("Email & SMS Alerts");
		sms.setBackground(Color.pink);
		sms.setFont(new Font("Raleway", Font.BOLD, 16));
		sms.setBounds(350,550,200,30);
		add(sms);
		cheque=new JCheckBox("Cheque Book");
		cheque.setBackground(Color.pink);
		cheque.setFont(new Font("Raleway", Font.BOLD, 16));
		cheque.setBounds(100,600,200,30);
		add(cheque);
		estatement=new JCheckBox("E-Statement");
		estatement.setBackground(Color.pink);
		estatement.setFont(new Font("Raleway", Font.BOLD, 16));
		estatement.setBounds(350,600,200,30);
		add(estatement);
		declaration=new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
		declaration.setBackground(Color.white);
		declaration.setFont(new Font("Raleway", Font.BOLD, 12));
		declaration.setBounds(100,680,600,30);
		add(declaration);
		
		submit= new JButton("Submit");
		submit.setBackground(Color.black);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Raleway", Font.BOLD, 14));
		submit.setBounds(220,720,100,35);
		submit.addActionListener(this);
		add(submit);
		
		cancel= new JButton("Cancel");
		cancel.setBackground(Color.black);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("Raleway", Font.BOLD, 14));
		cancel.setBounds(420,720,100,35);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.pink);//Color of Frame
		
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==submit)
		{
			String accountType=null;
			if(saving.isSelected())
			{
				accountType="Saving Acoount";
			}
			else if(fixed.isSelected())
			{
				accountType="Fixed Deposit Acoount";
			}
			else if(current.isSelected())
			{
				accountType="Current Acoount";
			}
			else if(recurring.isSelected())
			{
				accountType="Recurring Acoount";
			}
			
			Random random=new Random();
			String cardnumber=""+Math.abs((random.nextLong()%90000000L)+6020114000000000L);
			String pinnumber=""+Math.abs((random.nextLong()%9000L)+1000L);
			
			String facility="";
			if(atm.isSelected())
			{
				facility=facility+" ATM Card";
			}
			else if(internet.isSelected())
			{
				facility=facility+" Internet Banking";
			}
			else if(mobile.isSelected())
			{
				facility=facility+" Mobile Banking";
			}
			else if(sms.isSelected())
			{
				facility=facility+" Email & SMS Alerts";
			}
			else if(cheque.isSelected())
			{
				facility=facility+" Cheque Book";
			}
			else if(estatement.isSelected())
			{
				facility=facility+" E-Statement";
			}
			
			try
			{
				if(accountType.equals(""))
				{
					JOptionPane.showMessageDialog(null,"Account Type is Required");
				}
				else
				{
					Conn conn= new Conn();
					String query1="insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";

					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null, "Card Number: "+cardnumber+"\nPin: "+pinnumber);
					
					setVisible(false);
					new Deposit(pinnumber).setVisible(false);
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		else if(ae.getSource()==cancel)
		{
			setVisible(false);
			new Login().setVisible(true);
		}
	}
	public static void main(String[] args)
	{
		new SignupThree("");
	}

}
