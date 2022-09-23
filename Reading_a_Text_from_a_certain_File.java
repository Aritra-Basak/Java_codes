package placements;

import java.io.*;


public class File_Reader {

	public static void main(String[] args)  throws IOException
    {
		 
        // Creating a file and reading from local repository
        FileReader file = new FileReader("D:\\Interview.txt"); //here specify the location of the file, whose text you want to fetch.
 
        // Reading content inside a file
        BufferedReader fileInput = new BufferedReader(file);
 
        // Printing first 10 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 10; counter++)
            System.out.println(fileInput.readLine());
 
        // Closing all file connections
        // using close() method
        // Good practice to avoid any memory leakage
        fileInput.close();
    }
}
