package filehandling;
import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;
public class FileHandling1 {
	public static void main(String args[])
	{
		File f1=new File("newfile.txt");
		File f2=new File("yahoo2.txt");
		File f3=new File("gmail.txt");
		File f4=new File("hotlook.txt");
		List<String> arr=new ArrayList<String>();
		try
		{
			FileReader fr=new FileReader(f1);
			Scanner sc=new Scanner(fr);
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				arr.add(line);
			}
			
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
		//arr.forEach(System.out::println);
		
for(int i=0;i<arr.size();i++)
{
	String temp;
	if(arr.get(i).endsWith("gmail.com"))
	{
		try
		{
		temp=arr.get(i);
		Files.write(Paths.get("gmail.txt"), temp.getBytes(),StandardOpenOption.APPEND);
		}
		catch(IOException e)
		{
			System.out.println("Gmail File Not Found");
		}
	}
	else if(arr.get(i).endsWith("yahoo.com"))
	{
		try {
		temp=arr.get(i);
		Files.write(Paths.get("yahoo.txt"), temp.getBytes(),StandardOpenOption.APPEND);
		}
		catch(IOException e)
		{
			System.out.println("IO Exception in Yahoo");
		}
	}
	else if(arr.get(i).endsWith("hotlook.com"))
	{
		try {
			temp=arr.get(i);
			Files.write(Paths.get("hotlook.txt"),temp.getBytes(),StandardOpenOption.APPEND);
		}
		catch(IOException e)
		{
			System.out.println("IO Exception in hotmail");
		}
	}
	System.out.println("Completed");
 }
		
	}
	

}
