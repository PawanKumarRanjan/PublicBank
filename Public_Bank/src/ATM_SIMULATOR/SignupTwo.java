package ATM_SIMULATOR;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
	
	JTextField panTextField, aadharTextField;
	JButton next;
	JRadioButton scyes, scno, eayes, eano;
	JComboBox religion, category, income, education, occupation;
	String formno;
	SignupTwo(String formno)
	{
		this.formno=formno;
		setLayout(null);
		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
		
		JLabel additionalDetails=new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD,22));
		additionalDetails.setBounds(290,80,400,30);  //set bounds only works when seLayout is null
		add(additionalDetails);
		
		JLabel rel=new JLabel("Religion:");
		rel.setFont(new Font("Raleway", Font.BOLD,20));
		rel.setBounds(100,140,100,30);  //set bounds only works when seLayout is null
		add(rel);
		String valreligion[]= {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
		religion = new JComboBox(valreligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.white);
		add(religion);
		
		JLabel cat=new JLabel("Category:");
		cat.setFont(new Font("Raleway", Font.BOLD,20));
		cat.setBounds(100,190,200,30);  //set bounds only works when seLayout is null
		add(cat);
		String valCategory[]= {"General", "OBC", "SC", "ST", "Other"};
		category=new JComboBox(valCategory);
		category.setBounds(300,190,400,30);
		religion.setBackground(Color.white);
		add(category);
		
		JLabel inc=new JLabel("Income:");
		inc.setFont(new Font("Raleway", Font.BOLD,20));
		inc.setBounds(100,240,200,30);  //set bounds only works when seLayout is null
		add(inc);
		String incomecategory[]= {"Null", "<1,50,000", "<2,50,0000", "<5,00,000", "Upto 10,00,000"};
		income=new JComboBox(incomecategory);
		income.setBounds(300,240,400,30);
		income.setBackground(Color.white);
		add(income);
		
		JLabel edu=new JLabel("Educational:");
		edu.setFont(new Font("Raleway", Font.BOLD,20));
		edu.setBounds(100,290,200,30);  //set bounds only works when seLayout is null
		add(edu);
		JLabel qual=new JLabel("Qualification:");
		qual.setFont(new Font("Raleway", Font.BOLD,20));
		qual.setBounds(100,315,200,30);  //set bounds only works when seLayout is null
		add(qual);
		String educationValues[]= {"Non-Graduation", "Graduate", "Post-Graduation", "Doctrate", "Others"};
		education=new JComboBox(educationValues);
		education.setBounds(300,315,400,30);
		education.setBackground(Color.white);
		add(education);
		
		JLabel occ=new JLabel("Occupation:");
		occ.setFont(new Font("Raleway", Font.BOLD,20));
		occ.setBounds(100,390,200,30);  //set bounds only works when seLayout is null
		add(occ);
		String occupationValues[]= {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Others"};
		occupation=new JComboBox(occupationValues);
		occupation.setBounds(300,390,400,30);
		occupation.setBackground(Color.white);
		add(occupation);
		
		JLabel pan=new JLabel("PAN Number:");
		pan.setFont(new Font("Raleway", Font.BOLD,20));
		pan.setBounds(100,440,200,30);  //set bounds only works when seLayout is null
		add(pan);
		panTextField=new JTextField();
		panTextField.setFont(new Font("Raleway", Font.BOLD,14));
		panTextField.setBounds(300,440,400,30);
		add(panTextField);
		
		JLabel aadhar=new JLabel("Aadhar No:");
		aadhar.setFont(new Font("Raleway", Font.BOLD,20));
		aadhar.setBounds(100,490,200,30);  //set bounds only works when seLayout is null
		add(aadhar);
		aadharTextField=new JTextField();
		aadharTextField.setFont(new Font("Raleway", Font.BOLD,14));
		aadharTextField.setBounds(300,490,400,30);
		add(aadharTextField);
		
		JLabel sc=new JLabel("Senior Citizen:");
		sc.setFont(new Font("Raleway", Font.BOLD,20));
		sc.setBounds(100,540,200,30);  //set bounds only works when seLayout is null
		add(sc);
		scyes=new JRadioButton("Yes");
		scyes.setBounds(300,540,50,30);
		scyes.setBackground(Color.pink);
		add(scyes);
		scno=new JRadioButton("No");
		scno.setBounds(450,540,50,30);
		scno.setBackground(Color.pink);
		add(scno);
		ButtonGroup seniorcitizen=new ButtonGroup();
		seniorcitizen.add(scyes);
		seniorcitizen.add(scno);
		
		JLabel ea=new JLabel("Existing Account:");
		ea.setFont(new Font("Raleway", Font.BOLD,20));
		ea.setBounds(100,590,200,30);  //set bounds only works when seLayout is null
		add(ea);
		eayes=new JRadioButton("Yes");
		eayes.setBounds(300,590,100,30);
		eayes.setBackground(Color.pink);
		add(eayes);
		eano=new JRadioButton("No");
		eano.setBounds(450,590,100,30);
		eano.setBackground(Color.pink);
		add(eano);
		ButtonGroup existingaccount=new ButtonGroup();
		existingaccount.add(eayes);
		existingaccount.add(eano);
		
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
		String sformno=formno;
		String sreligion=(String)religion.getSelectedItem();
		String scategory=(String)category.getSelectedItem();
		String sincome=(String)income.getSelectedItem();
		String seducation=(String)education.getSelectedItem();
		String soccupation=(String)occupation.getSelectedItem();
		
		String seniorcitizen=null;
		if(scyes.isSelected())
		{
			seniorcitizen="Yes";
		}
		else if(scno.isSelected())
		{
			seniorcitizen="No";
		}
		
		String existingaccount=null;
		if(eayes.isSelected())
		{
			existingaccount="Yes";
		}
		else if(eano.isSelected())
		{
			existingaccount="No";
		}
		
		String span=panTextField.getText();
		String saadhar=aadharTextField.getText();
		
		try
		{
			Conn c = new Conn();
			String query="insert into signuptwo values('"+sformno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
			c.s.executeUpdate(query);
			
			setVisible(false);
			new SignupThree(formno).setVisible(true);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		new SignupTwo("");
	}
}