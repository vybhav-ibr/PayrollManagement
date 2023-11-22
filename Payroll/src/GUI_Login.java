import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


class GUI_Login implements ActionListener
{
	private static JLabel user_label;
	private static JTextField user_field;
	private static JLabel pass_label;
	private static JPasswordField pass_field;
	private static JButton button;
	private static JLabel success;
	private JFrame frame;
	public  String info[]= {"Default","Default"};
	public boolean valente=false;
	GUI_Login(JFrame frame) {
		this.frame = frame;
		frame.setTitle("Login");
		JPanel panel=new JPanel();
		
		frame.add(panel);
		panel.setLayout(null);
		
		user_label=new JLabel("Username :");
		user_label.setBounds(10,20,80,25);
		panel.add(user_label);
		
		pass_label=new JLabel("Password :");
		pass_label.setBounds(10,50,80,25);
		panel.add(pass_label);
		
		success=new JLabel("");
		success.setBounds(10,100,300,25);
		panel.add(success);
		
		user_field=new JTextField(40);
		pass_field=new JPasswordField(40);
		
		user_field.setBounds(100,20,165,25);
		panel.add(user_field);
		pass_field.setBounds(100,50,165,25);
		panel.add(pass_field);
		
		button=new JButton("Submit");
		button.setBounds(100,80,80,25);
		button.addActionListener(this); // use "this" to refer to the current instance of the class
		panel.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//String info[]=new String[2];
		info[0]=user_field.getText();
		info[1]=pass_field.getText();
		this.valente=true;
		try
		{
			Pass_Data pk=Pass_Data.valueOf(info[0]);
			if(pk.getPass().equals(info[1]))
			{
				success.setText("Login successful");
				frame.dispose();
				GUI g1=new GUI(pk.getAd());
			}
			else
				success.setText("Wrong username/password");
		}
		catch(java.lang.IllegalArgumentException er)
		{
			success.setText("Wrong username/password");
		}
		//send_data();
		/*if(user.equals(password)){
			success.setText("Login successful");
		}
		else success.setText("Wrong username/Password");*/
	
	}
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();
		frame.setSize(450,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUI_Login g1=new GUI_Login(frame);
		frame.setVisible(true);
	}
}

