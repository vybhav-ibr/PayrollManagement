import java.io.*;
public class Store_data {

	public boolean to_file(String n,String r,String s, String depa)
	{
		int cnt=0;
		try 
		{
			FileWriter out=new FileWriter("newfile.txt",true);
			out.append(n+" , "+r+" , "+s+" , "+depa);
			//for(int ele:sal)
				//out.append(ele+" ");
			//out.append(" , "+calc_per(sal));
			out.append("\n");
			out.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			cnt++;
		}
		if(cnt>0) return false;
		return true;
	}
	
	public static void main(String[] args) {
		//File file =new File("newfile.txt");
		Store_data s=new Store_data();
		//s.to_file("jhgfng","jfgjf","mhgfgjf");
		/*
		try {
			FileWriter out=new FileWriter("newfile.txt");
			out.write("tfjhfvfggfcfchggc hhhbgdvcf");
			//out.nullWriter();
			out.write("\n");
			out.write("Line 2");
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		try {
			FileReader in=new FileReader("newfile.txt");
			char a[]=new char[200];
			in.read(a);
			//in.re
			System.out.println(a);
			in.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*
	    try {

	        // trying to create a file based on the object
	         * 
	        boolean value = file.createNewFile();
	        if (value) {
	          System.out.println("The new file is created.");
	        }
	        else {
	          System.out.println("The file already exists.");
	        }
	      }
	      catch(Exception e) {
	        e.getStackTrace();
	      }*/
	}
	/*
	public boolean to_file(String name, String roll, String salary) {
		// TODO Auto-generated method stub
		return false;
	}*/
}
