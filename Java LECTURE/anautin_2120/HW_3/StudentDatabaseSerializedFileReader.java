import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


// STATIC
public class StudentDatabaseSerializedFileReader
{
	private static ObjectInputStream input;



	public static void openFile(String filename)
	{
		try
		{
			input = new ObjectInputStream(Files.newInputStream(Paths.get(filename)));
		}
		catch (IOException ioException)
		{
			System.err.println("Error opening file.");
			System.exit(1);
		}
	}//END





	public static StudentDatabase readData()
	{

		StudentDatabase db = new StudentDatabase();

		
		while(true)
		{
			
			try
			{
				Student current = (Student)input.readObject();
				db.add(current);


			}
			catch(EOFException endOfFileException)
			{
				return db;

			}
			catch(ClassNotFoundException classNotFoundException)
			{
				System.err.println("Invalid object type. Terminating.");
				break;
			}
			catch(IOException ioException)
			{
				System.err.println("Error reading from file. Terminating.");
				break;
			}
		}

		return db;

	}//END




	public static void closeFile() 
	{
		try
		{
			if (input  != null)
			{
				input.close();
			}
		}
		catch (IOException ioException)
		{
			System.err.println("Error closing file. Terminating.");
			System.exit(1);
		}

    }//END



	
}//END CLASS









