package Programming;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class SystemFact {
	
	
	    public static void main(String arr[]) throws FileNotFoundException
	    {
	        // Creating a File object that represents the disk file.
	        PrintStream o = new PrintStream(new File("C:\\Users\\dell pc\\Desktop\\A.txt"));
	 
	        // Store current System.out before assigning a new value
	        PrintStream console = System.out;
	 
	        // Assign o to output stream
	        System.setOut(o);
	        System.out.println("This will be written to the text file");
	 
	        // Use stored value for output stream
	        System.setOut(console);
	        System.out.println("This will be written on the console!");
	    }
	}

