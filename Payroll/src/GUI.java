import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class GUI implements ActionListener{
	JFrame j=new JFrame("Choice");
	String command=null;
	GUI(boolean admin)
	{
		j.setVisible(true);
		j.setSize(485, 150);
		j.setLayout(null);
		
		JLabel l1=new JLabel("What would you like to do ?");
		l1.setBounds(50, 10, 250, 30);
		//l1.setText();
		j.add(l1);
		/*
		JPanel jp=new JPanel();
		//j.add(jp);
		 */
		if(admin==true)
		{
			JButton b1=new JButton("Enter Records");
			b1.setBounds(10, 50, 150, 50);
			b1.addActionListener(this);
			j.add(b1);
			
			JButton b2=new JButton("View Records");
			b2.setBounds(160, 50, 150, 50);
			b2.addActionListener(this);
			j.add(b2);
			
			JButton b3=new JButton("Filter & Search");
			b3.setBounds(310, 50, 150, 50);
			b3.addActionListener(this);
			j.add(b3);
		}
		else if(admin==false)
		{
			JButton b2=new JButton("View records");
			b2.setBounds(60, 50, 150, 50);
			b2.addActionListener(this);
			j.add(b2);
			
			JButton b3=new JButton("Exit");
			b3.setBounds(210, 50, 150, 50);
			b3.addActionListener(this);
			j.add(b3);
		}
	}
	void disp()
	{
		
	}
	
	public static void main(String[] args)
	{
		GUI g=new GUI(true);
		g.disp();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		command=e.getActionCommand();
		j.dispose();
		
		JFrame frame=new JFrame();
		frame.setSize(450,200);
		//GUI_Login gl=new GUI_Login(frame);
		//frame.setVisible(true);
		
		if(command.equalsIgnoreCase("Enter Records"))
		{
			System.out.println("Enter marks command chosen");
			frame.dispose();
			GUI_Enter_Marks em=new GUI_Enter_Marks();
			//create object of enter class GUI
		}
		else if(command.equalsIgnoreCase("View Records"))
		{
			System.out.println("View marks command chosen");
			frame.dispose();
			GUI_View_Marks vm=new GUI_View_Marks();
			//create object of view marks GUI 
		}
		else if(command.equalsIgnoreCase("Filter & search"))
		{
			System.out.println("Filter based on departments command chosen");
			frame.dispose();
			System.out.print("Enter the department/id :");
			java.util.Scanner sc=new java.util.Scanner(System.in);
			String reqdep=sc.next();
			Filter_Data fd=new Filter_Data(reqdep);
			//create object of analysis 
		}
		else if(command.equalsIgnoreCase("Exit"))
		{
			frame.dispose();
		}
	}
}
/*
class mainDemo
{
	public static void main(String[] args)
	{
		GUI g=new GUI();
	}
}
*/
