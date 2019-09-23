import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;


// STATIC
public class StudentDatabaseCSVFileReader {


    // class Scanner is used for character-based input
    // you READ input
    private static Scanner input;

	
	
	
    // sending in a String argument of 0
    public static void openFile (String filename) {

        try {
            input = new Scanner(Paths.get(filename));
        }   
        catch (IOException e) {
            System.err.println("Error opening file.  Terminating");
            System.exit(1);
        }        
    } //END     

   
   
   
   
   
   
   
   
   

	// Method that returns a StudentDatabase object after we have written that data into it from our CSV file 
    public static StudentDatabase readData() {
        StudentDatabase db = new StudentDatabase();
        int numLines = 0;
        
		// while there is something left to read in this file...
		while (input.hasNext()) {
            
			
			// reading in one single line of data from the file
			String line = input.nextLine();
            numLines++;
            
			
			
			// must split that one giant String into sub strings that can eventually be stored inside instance variables
			String[] fields = line.split(","); 
            
			
			
			// Because the first line contains the actual header information??
			if (numLines != 1)
                
				// now we can separate and store data values into instance variables
				parseDataFromCSVFile(fields, db);
        }                    
        return db;
    }//END

    


    // Will parse the data from the fields[] array
	// Will store each resulting piece of data into its corresponding instance variable for that student
	// Will add that student into the StudentDatabase object == db
	private static void parseDataFromCSVFile(String[] fields, StudentDatabase db) {
        Student ts = new Student();
        // parse and set student ID
        int id = Integer.parseInt(fields[0]);
        ts.setStudentID(id);
        
		
		
		// parse and set sex
        ts.setSex(fields[1]);
        
		
		
		// parse and set Ethnic Group
        ts.setEthnicGroup(fields[2]);
        
		
		// parse and set name - the name is first, last in fields at indices 3 and 4
        // also we need to get rid of double quotes
        StringBuilder lastName =  new StringBuilder(fields[3]);
        lastName.deleteCharAt(0);
        
		
		//System.out.println(lastName);
        StringBuilder firstAndMiddle = new StringBuilder(fields[4]);
        firstAndMiddle.deleteCharAt(fields[4].length()-1);
        firstAndMiddle.deleteCharAt(0);
        String firstAndMiddleString = firstAndMiddle.toString();
        
		String[] nameFields = firstAndMiddleString.split(" "); // the first and middle are parsed together so split them
        ts.setFirstName(nameFields[0]);
        ts.setMiddleInitial(nameFields[1]);
        ts.setLastName(lastName.toString());
        
		
		// set primary program
        ts.setProgram(fields[5]);
        
		
		// set academic plan
        ts.setAcademicPlan(fields[6]);
        
		
		// set subplan
        ts.setSubPlan(fields[7]);
        
		
		// set start level
        int sl = Integer.parseInt(fields[8]);
        ts.setStrtLevel(sl);
        
		
		// set "total" ?
        double tot = Double.parseDouble(fields[9]);
        ts.setTotal(tot);
        
		
		// set GPA
        double gpa = Double.parseDouble(fields[10]);
        ts.setGPA(gpa);
        
		
		// set FAFSA (on file?)
        ts.setFAFSA(fields[11]);
        double takePrgrs = Double.parseDouble(fields[12]);
        ts.setTakePrgrs(takePrgrs);
        
		
		// set financial need
        double need = Double.parseDouble(fields[13]);
        ts.setFinancialNeed(need); 
        
		
		// add student to the database object 
		db.add(ts);
    
	}//END

    


    public static void closeFile() {
        if (input != null)
            input.close();
        input = null;
    }//END







}//END CLASS





