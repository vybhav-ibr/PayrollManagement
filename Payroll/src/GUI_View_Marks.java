import java.io.*;
import java.util.*;
import javax.swing.*;

public class GUI_View_Marks {
	JScrollPane sp;
	JFrame jf=new JFrame();
	public static Vector<Vector<String>> data=new Vector<Vector<String>>();
	GUI_View_Marks()
	{
		int cnt=0;
		try 
		{
			//FileReader in=new FileReader("newfile.txt");
			FileInputStream fstream = new FileInputStream("newfile.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			Vector<String> head=new Vector<String>();
			head.addElement("Name");
			head.addElement("Id");
			head.addElement("Salary");
			head.addElement("Department");
			data.addElement(head);
			String strLine;
			while ((strLine = br.readLine()) != null)   {
			  // Print the content on the console
			  //System.out.println(strLine);jehgkj
			  String[] one=strLine.split(",");
			  Vector<String> a=new Vector<String>();
			  for(int i=0;i<one.length;i++)
				  a.addElement(one[i]);
			  data.addElement(a);
			  /*
			  for(Object ele:a)
				  System.out.println(ele);
			  //for(String ele:one)
				//  System.out.println(ele+" ");
			  System.out.println("\n");*/
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			cnt++;
		}
		//if(cnt>0) return false;
		//return true;
		Vector<String> header=new Vector<String>();
		header.addElement("Name");
		header.addElement("Id");
		header.addElement("Marks");
		header.addElement("Percentage"); 
		JTable jt=new JTable(data,header);
		jt.setVisible(true);
		jt.setBounds(0,0,500,500);
		jf.setTitle("Records");
		jf.setVisible(true);
		jf.setSize(500,350);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//jf.setLocationRelativeTo(null); // Center the window on the screen
		jf.add(jt);
		//sp=new JScrollPane(jt);
		//jf.getContentPane().add(sp);
	}
	public static void main(String[] args) {
		GUI_View_Marks mk=new GUI_View_Marks();
		//mk.from_file();

	}

}
