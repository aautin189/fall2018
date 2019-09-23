import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


// STATIC
public class StudentDatabaseSerializedFileWriter
{
	
	private static ObjectOutputStream output;
	
	
	
	
	public static void openFile(String filename)
	{
		try
		{
			output = new ObjectOutputStream(Files.newOutputStream(Paths.get(filename)));
		}
		catch(IOException ioException)
		{
			System.err.println("Error opening file. Terminating.");
			System.exit(1);
		}
	}//END
	
	
	
	
	
	public static void writeData(StudentDatabase db)	
	{
		try
		{
			output.writeObject(db);
		}

		catch(IOException ioException)
		{
			System.err.println("Error writing to file. Terminating.");
			System.exit(1);
		}
		

		
		//int numStudents = db.getNumStudents();
		
		//for (int i=0; i<numStudents; i++)
		//{
		//	Student current = db.getStudent(i);
		//	output.writeObject(current);
		//}
		
		
	}//END
	

	
	
	   
	public static void closeFile()
	{
		try
		{
			if (output  != null)
			{
				output.close();
			}
		}
		catch (IOException ioException)
		{
			System.err.println("Error closing file. Terminating.");
			System.exit(1);
		}

    }//END
	

	
	
	
	
	
}//END CLASS