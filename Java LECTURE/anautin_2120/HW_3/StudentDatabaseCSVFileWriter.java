import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Formatter;


// STATIC
public class StudentDatabaseCSVFileWriter {

    // class Formatter is used for character-based output
    // you WRITE output
    private static Formatter output;

    
    // METHOD
    public static void openFile (String filename) {

        try {
            output = new Formatter(filename);
        }   
        catch (IOException e) {
            System.err.println("Error opening file.  Terminating");
            System.exit(1);
        }        
    }//END







    // METHOD
    public static void writeData(StudentDatabase db) {
        int numStudents = db.getNumStudents();
        output.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", "ID","Sex","Ethnic Grp","Name","Prim Prog","Acad Plan","Sub-Plan","Strt Level","Total","GPA","FAFSA","Take Prgrs","Fin Need");
        output.format("%n");
        
        for (int i=0; i<numStudents; i++) {
            Student current = db.getStudent(i);
            output.format("%d,%s,%s,%s,%s,%s,%s,%d,%f,%f,%s,%f,%f,",current.getStudentID(),current.getSex(),current.getEthnicGroup(), "\"" + current.getLastName() + ", " + current.getFirstName() + " " + current.getMiddleInitial() + "\"", current.getProgram(), current.getAcademicPlan(), current.getSubPlan(), current.getStrtLevel(), current.getTotal(), current.getGPA(), current.getFAFSA(), current.getTakePrgrs(), current.getFinancialNeed());



            // end the line that represents all the data for one student
            output.format("%n");
        }
    }//END







    // METHOD
    public static void closeFile() {
        if (output != null)
            output.close();
        output = null;
    }//END









}//END CLASS






