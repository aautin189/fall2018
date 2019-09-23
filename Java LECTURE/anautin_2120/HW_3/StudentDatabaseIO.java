import java.util.ArrayList;
import java.io.IOException;


// STATIC
public class StudentDatabaseIO
{

	

	public static void main(String [] args)throws Exception
	{


        String formattedFilename = "student.csv";
        String serializedFilename = "sortedStudents.ser";

        String formattedFilename2 = "sortedStudents.csv";


        formattedToSerialized(formattedFilename, serializedFilename);
        

	
	}//END


	public static void formattedToSerialized(String inFilename, String outFilename)throws Exception
	{
	

		// READING
        // reads in the formatted text file that is sent to the method
        StudentDatabaseCSVFileReader.openFile(inFilename);
		StudentDatabase db = StudentDatabaseCSVFileReader.readData();
        StudentDatabaseCSVFileReader.closeFile();

        // sorts the students
        db.sortByGPA();

        // WRITING
        // write the objects out in serialized format 
        StudentDatabaseSerializedFileWriter.openFile(outFilename);
        StudentDatabaseSerializedFileWriter.writeData(db);
        StudentDatabaseSerializedFileWriter.closeFile();
		
		
	}//END
	
	

	
	public static void serializedToFormatted(String inFilename, String outFilename)throws Exception
	{
		

		// READING
        // reads in a serialized file into a student database object
        StudentDatabaseSerializedFileReader.openFile(inFilename);
		StudentDatabase db = StudentDatabaseSerializedFileReader.readData();
        StudentDatabaseSerializedFileReader.closeFile();

        // sorts the students
        db.sortByGPA();

        // WRITING
        // writes the database back out as a formatted file
        StudentDatabaseCSVFileWriter.openFile(outFilename);
        StudentDatabaseCSVFileWriter.writeData(db);
        StudentDatabaseCSVFileWriter.closeFile();

		
	}//END
	
	
	
	
	

}//END CLASS

