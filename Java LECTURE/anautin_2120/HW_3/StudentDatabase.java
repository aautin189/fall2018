import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.io.Serializable;




/**
* Class that allows us to create a database to store student information
* Object class
*
* @author   C. Summa
* @version  Fall 2018
*/
public class StudentDatabase implements Serializable{

    
    private ArrayList<Student> theData;
    



    /**
    * CONSTRUCTOR: instantiates a new array list to store Student objects
    *
    */
    public StudentDatabase() {

        theData = new ArrayList<Student>();
    }

    


    /**
    * Adds a Student object to the array list that represents the database 
    *
    * @param s      The student we want to add to our student database
    */
    public void add(Student s) {
        theData.add(s);
    }



    /**
    * Provides the sum of Student objects we have in our database
    *
    * @return Returns the sum of total Student objects present inside our student database 
    *
    */  
    public int getNumStudents() {
        return theData.size();
    }



    /**
    * Using a particular student's ID number, this method locates and returns the index location of that student object in database
    *
    * @param studentID    The student identification number of a specific Student Object inside our database
    * @return Returns the index location of the Student object matching the provided student ID number
    *
    */ 
    public int getIndexOfStudentWithID(int studentID) {
        for (int i=0; i< theData.size(); i++) {
            if (theData.get(i).getStudentID() == studentID)
                return i;
        }
        return -1;
    } 



    /**
    * 
    *
    * @param index    
    * @return 
    *
    */
    public Student getStudent(int index) {
        return theData.get(index);
    }



    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void sortByGPA() {
        Collections.sort(theData, 
                        new Comparator<Student>() {
                            public int compare(Student s1, Student s2) {
                                if (s1.getGPA() > s2.getGPA())
                                    return -1;
                                else if (s1.getGPA() < s2.getGPA())
                                    return 1;
                                return 0;
                            }
                        } );
    }

    

    /**
    * 
    *
    * @param     
    * @return 
    *
    */
    public ArrayList<Student> getData() {
        return theData;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String toString() {
        StringBuilder returnVal = new StringBuilder();
        for (Student s : theData) {
            returnVal.append(s.toString());
            returnVal.append("\n");
        }
        return returnVal.toString();
    }



}//END CLASS






