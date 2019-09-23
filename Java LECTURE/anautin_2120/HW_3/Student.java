
import java.io.Serializable;

/**
* Class that allows us to create new students that can be stored in a central database
* Object class
*
* @author   C. Summa
* @version  Fall 2018
*/
public class Student implements Serializable{

    private int     studentID;
    private String  sex;
    private String  ethnicGroup;
    private String  lastName;
    private String  firstName;
    private String  middleInitial;
    private String  program;
    private String  academicPlan;
    private String  subPlan;
    private int     strtLevel;
    private double  total;
    private double  gpa;
    private String  fafsa;
    private double  takePrgrs;
    private double  financialNeed;



    /**
    * CONSTRUCTOR: instantiates all instance variables to either null or 0.0 for numerical data
    *
    */
    public Student() {
        studentID       = 0;
        sex             = "";
        ethnicGroup     = "";
        lastName        = "";
        firstName       = "";
        middleInitial   = "";
        program         = "";
        academicPlan    = "";
        subPlan         = "";
        strtLevel       = 0;
        total           = 0.0;
        gpa             = 0.0;
        fafsa           = "";
        takePrgrs       = 0.0;
        financialNeed   = 0.0;
    }


    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public int getStudentID() {
        return this.studentID;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setSex(String sex) {
        this.sex = sex;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getSex() {
        return this.sex;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }



    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getEthnicGroup() {
        return this.ethnicGroup;
    }


    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setFirstName(String n) {
        this.firstName = n;
    }



    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getFirstName() {
        return this.firstName;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setLastName(String n) {
        this.lastName = n;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getLastName() {
        return this.lastName;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setMiddleInitial(String n) {
        this.middleInitial = n;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getMiddleInitial() {
        return this.middleInitial;
    }



    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void  setProgram(String program) {
        this.program = program;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String  getProgram() {
        return this.program;
    }
 



    /**
    * 
    *
    * @param    
    * @return 
    *
    */    
    public void setAcademicPlan(String academicPlan) {
        this.academicPlan = academicPlan;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getAcademicPlan() {
        return this.academicPlan;
    }

    


    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setSubPlan(String subPlan) {
        this.subPlan = subPlan;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getSubPlan() {
        return this.subPlan;
    }



    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setStrtLevel(int strtLevel) {
        this.strtLevel = strtLevel;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public int getStrtLevel() {
        return this.strtLevel;
    }



    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setTotal(double total) {
        this.total = total;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public double getTotal() {
        return this.total;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public double getGPA() {
        return this.gpa;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setFAFSA(String fafsa) {
        this.fafsa = fafsa;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String getFAFSA() {
        return this.fafsa;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setTakePrgrs(double takePrgrs) {
        this.takePrgrs = takePrgrs;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public double getTakePrgrs() {
        return this.takePrgrs;
    }




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public void setFinancialNeed(double financialNeed) {
        this.financialNeed = financialNeed;
    } 




    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public double getFinancialNeed() {
        return this.financialNeed;
    } 



    // TELL ME IF 2 OBJECTS == THE SAME STUDENT
    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Student)
            return (studentID == ((Student)other).getStudentID());
        return false;
    }


    // TELL ME THE CURRENT STATE OF YOUR OBJECT
    /**
    * 
    *
    * @param    
    * @return 
    *
    */
    public String toString() {
        String returnVal = "";
        returnVal += studentID + " : " + firstName + " " + middleInitial + " " + lastName + " : " + gpa + " : " + financialNeed + " FAFSA: " + fafsa;
        return returnVal;
    }
    





}//END CLASS
