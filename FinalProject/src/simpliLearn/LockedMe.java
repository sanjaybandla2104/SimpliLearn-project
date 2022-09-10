package simpliLearn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe

{
static final String projectFilesPath="C:\\Users\\Asus\\eclipse-workspace\\LockedMeSecureApp";
	public static void displayMenu()
	{
		System.out.println("<<<<********************************************>>>>"); 
		System.out.println("\t****WELCOME TO LOCKEDME.SECURE APP****");
		System.out.println("\t\t**DEVELOPED BY :BANDLA SANJAY**");
		System.out.println("<<<<********************************************>>>>");
	
		System.out.println("\t\t1.Display All Files");
		System.out.println("\t\t2.Add a new file");
		System.out.println("\t\t3.Search Files");
		System.out.println("\t\t4.delete files");
		System.out.println("\t\t5.exit");
	}
	
	
	public static void getAllFiles() 
	{
		
		File folder = new File(projectFilesPath);
		File[] listOfFiles = folder.listFiles();
		if(listOfFiles.length>0)
		{
		System.out.println("listoffiles displayed below\n");
	    for(var l:listOfFiles)
	    {
	
	    System.out.println(l.getName());	
	    }
		}
		else
		{	
		
		System.out.println("this folder is empty");	
		}
		
	}	

	public static void createFiles()
	{
	try
	{
	Scanner obj = new Scanner(System.in);
	String fileName;
	System.out.println("Enter the file name: ");
	fileName=obj.nextLine();
	
	int linesCount;
	System.out.println("Enter how many lines in the file:");
    linesCount = Integer.parseInt(obj.nextLine());
	 
		
	FileWriter fw = new FileWriter(projectFilesPath+"\\"+fileName);
	for(int i=1;i<=linesCount;i++);
	{
	
		System.out.println("Enter file line:");
	    fw.write(obj.nextLine()+"\n");
	} 
	System.out.println("file created successfully");
	fw.close();
	}
	
	catch (Exception e)
	{
	
	}

	
	}
   public static void searchFiles() 
   {
    Scanner obj= new Scanner(System.in);
    try
  {
    String fileName;
    System.out.println("Enter file name to be searched");
    fileName=obj.nextLine();
    File f1=new File(projectFilesPath+"\\"+fileName);
    if(f1.exists())
    {
	
	System.out.println("file is avaiable");
	
    }
    else 
    {
	System.out.println("file is not available");
    }
   }
    catch(Exception Ex) {
    	
    }
   }
	
   
   public static void deleteFiles() 
   {
   Scanner obj = new Scanner(System.in);
   try
   {
   String fileName;
   System.out.println("Enter file name to be deleted");
   fileName=obj.nextLine();
   File f1 = new File(projectFilesPath+"\\"+fileName);
   if(f1.exists())
   {
   f1.delete();
   System.out.println("File deleted sussessfully");
   
   }
   else
   {
	   System.out.println("File not exist");
   }
   }
   catch(Exception Ex)
   {
   System.out.println("some error occoured");
   }
   
   }
   
   
   
   }
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	