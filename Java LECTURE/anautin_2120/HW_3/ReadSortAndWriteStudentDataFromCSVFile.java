import java.util.ArrayList;



// This class opens a file, sorts the student data by GPA, then writes the data into a CSV file
// In order to do this, it uses the StudentDatabaseCSVFileReader & the StudentDatabaseCSVFileWriter classes
public class ReadSortAndWriteStudentDataFromCSVFile {

    
    // RUNNER CLASS
    public static void main(String[] args) {

        if (args.length != 2) {
            System.err.println("Usage: ReadSortAndWriteStudentDataFromCSVFile inputfilename outputfilename");
            System.exit(1);
        }//END



        String infilename = args[0];
        String outfilename = args[1];


        // READING
        // - read data from CSV file into a database object == an array list of students
        StudentDatabaseCSVFileReader.openFile(infilename);
        // will read data from CSV file and store it into a StudentDatabase object called db
		StudentDatabase db = StudentDatabaseCSVFileReader.readData();
        StudentDatabaseCSVFileReader.closeFile();

        // sort our database arrayList by GPA before we re-write our data into the CSV file
        db.sortByGPA();


        // WRITING
        // - after sorting those students by GPA inside the database array list, we must re-write... 
        // those objects out to our CSV file (overriding the previous data) 
        StudentDatabaseCSVFileWriter.openFile(outfilename);
        StudentDatabaseCSVFileWriter.writeData(db);
        StudentDatabaseCSVFileWriter.closeFile();
         
    }//END


}//END CLASS























