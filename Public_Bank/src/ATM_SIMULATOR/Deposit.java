package ATM_SIMULATOR;
import java.awt.*;
import  javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
	
	JTextField amount;
	JButton deposit, back;
	String pinnumber;
	Deposit(String pinnumber)
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("Enter the amount you want to deposit");
		text.setForeground(Color.white);
		text.setFont(new Font("System", Font.BOLD,16));
		text.setBounds(190,300,400,20);
		image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Raleway", Font.BOLD,22));
		amount.setBounds(180,350,320,20);
		image.add(amount);
		
		deposit=new JButton("Deposit");
		deposit.setBounds(355,450,150,30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back=new JButton("Back");
		back.setBounds(355,500,150,30);
		back.addActionListener(this);
		image.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==deposit)
		{
			String cash=amount.getText();
			Date date = new Date();
			
			if(cash.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please enter the amount you want to deposit");
			}
			else
			{
				try
				{
					Conn conn=new Conn();
					String query="insert into cash values('"+pinnumber+"','"+date+"','Deposit', '"+cash+"')";
					conn.s.executeUpdate(query);
					JOptionPane.showMessageDialog(null,"Rs "+cash+" Deposited Successfully");
					setVisible(false);
					new Transactions(pinnumber).setVisible(true);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
			new Transactions(pinnumber).setVisible(true);
		}
	}
	
	public static void main(String[] args)
	{
		new Deposit("");
	}

}
