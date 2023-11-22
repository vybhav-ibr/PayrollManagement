import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
interface inter
{
	public void excephandle(Exception aa);
}
public class Filter_Data implements inter{
	public static Vector<Vector<String>> data=new Vector<Vector<String>>();
	JFrame jf=new JFrame();
	Filter_Data(String reqdep)
	{
		try
		{
			FileInputStream fstream = new FileInputStream("newfile.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			Vector<String> head=new Vector<String>();
			head.addElement("Name");
			head.addElement("Id");
			head.addElement("Salary");
			head.addElement("Department");
			data.addElement(head);
			String strLine=null;
			
			while ((strLine = br.readLine()) != null)   {
				  // Print the content on the console
				  //System.out.println(strLine);jehgkj
				  String[] one=strLine.split(",");
				  Vector<String> a=new Vector<String>();
				  for(int i=0;i<one.length;i++)
					  a.addElement(one[i]);
				  if(one[one.length-1].equalsIgnoreCase(reqdep))
					  data.addElement(a);
				  else if(one[1].equalsIgnoreCase(reqdep))
					  data.addElement(a);
				  for(Object ele:a)
					  System.out.println(ele);
				  //for(String ele:one)
					//  System.out.println(ele+" ");
				  System.out.println("\n");
			}

		}
		catch(Exception e)
		{
			excephandle(e);
		}
		Vector<String> header=new Vector<String>();
		header.addElement("Name");
		header.addElement("Roll");
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
		jf.add(jt);
		
	}
	public static void main(String[] args)
	{
		Filter_Data fd=new Filter_Data("HR");
	}
	@Override
	public void excephandle(Exception aa) {
		System.out.println(aa.getMessage());
		
	}
}

