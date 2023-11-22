import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUI_Enter_Marks implements ActionListener{
	JFrame f=new JFrame("Enter Recors");
	JLabel name=new JLabel("Name :");
	JLabel roll=new JLabel("Id :");
	JLabel salary=new JLabel("Salary :");
	JLabel dep=new JLabel("Department :");
	JLabel message=new JLabel();
	JTextField namef=new JTextField();
	JTextField rollf=new JTextField();
	JTextField salf=new JTextField();
	JTextField depf=new JTextField();
	JButton b=new JButton("Submit");
	
	GUI_Enter_Marks()
	{
		f.setSize(400,300);
		f.setLayout(null);
		f.setVisible(true);
		name.setBounds(90, 40, 50, 30);
		roll.setBounds(113, 70, 50, 30);
		salary.setBounds(88, 100, 150, 30);
		dep.setBounds(59, 130, 150, 30);
		
		
		namef.setBounds(140, 40, 150, 30);
		rollf.setBounds(140,70,150,30);
		salf.setBounds(140, 100, 150, 30);
		depf.setBounds(140, 130, 150, 30);
		
		f.add(name);
		f.add(roll);
		f.add(salary);
		f.add(dep);
		
		f.add(namef);
		f.add(rollf);
		f.add(salf);
		f.add(depf);
		
		b.setBounds(170, 180, 80, 40);
		b.addActionListener(this);
		f.add(b);
		
		message.setBounds(10,220,200,30);
		f.add(message);
	}
	public static void main(String[] args) {
		GUI_Enter_Marks g=new GUI_Enter_Marks();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("Marks entered");
		String name="",roll="",salary="",depa="";
		name=namef.getText();
		roll=rollf.getText();
		salary=salf.getText();
		depa=depf.getText();
		//int mar[]= {-99,-99,-99,-99,-99};
		//String mark[]=marks.split(" ");
		//int markint[]=new int[5];
		boolean fail=false;
		/*
		try 
		{
			for(int i=0;i<5;i++)
			{
				mar[i]=Integer.parseInt(mark[i]);
			}
		}
		catch(Exception interr)
		{
			fail=true;
		}*/
		try
		{
			Integer.parseInt(roll);
		}
		catch(Exception interr)
		{
			fail=true;
		}
		try
		{
			Integer.parseInt(salary);
		}
		catch(Exception interr)
		{
			fail=true;
		}
		//for(int ele:mar) if((ele>100)||(ele<0)) fail=true;
		if((name.length()==0)||(roll.length()==0)||(salary.length()==0)||(fail==true))
		{
			message.setText("Wrong deetails entered");
			//namef.setText("");
		}
		else
		{
			message.setText("Data Entered Successfully");
			Store_data s=new Store_data();
			boolean stat=s.to_file(name,roll,salary,depa);
			if(stat==true)
				System.out.println("data entered");
			else
				System.out.println("data not entered");
		}
		
	}

}
