import java.util.Random;


// RUNNER CLASS
public class MakeRandomStudents {

    
	// This class will yield random combinations on these values that we provided during array instantiations
    public static void main(String[] args) {


    	// Print out this error message if the command line argument is anything other than 1
        if (args.length != 1) {
            System.err.println("Usage:  MakeRandomStudents numstudents");
            System.exit(1);
        }



        // taking an argument passed in at the command line to determine how many times we create a new random Student object
        // parses this String argument as a signed decimal number(it is a String because we passed it in from the command line)
        int numNames = Integer.parseInt(args[0]);




        // ARRAY - student first names
        String[] firstNames = {"Joe","Mary","Louis","Becky","Leonard","Steve","Stacey","Greg","James","Joan","Haydar","Lucy","Chris","Kris","Stan","Alice","Bob","Josie","Jose","Kendra","T-Bob","Maria","Andrew","Jill","Lars","Nolan","Doug","Xavier","Francine","Ann","Sridhar","Bhupinder","Jason","Walter","Brian","Nancy","Michael","Thien"};

        // ARRAY - student middle initials
        String[] middleInitials = {"A.","B.","C.","D.","E.","F.","G.","H.","I.","J.","K.","L.","M.","N.","O.","P.","Q.","R.","S.","T.","U.","V.","W.","X.","Y.","Z."};

        // ARRAY - student last names
        String[] lastNames = {"Jackson","Boudreaux","Thibodeaux","Landry","Nemoy","Kirk","Levitt","Pham","Nguyen","Wynn","Schwing","Johnson","Lee","Abdelguerfi","Bowen","Smith","Jones","Baker","Naquin","Sennheiser","Keonnigsegg","Stuart","Tudor","Abromov","Jaeger","Jarndyce","Cooper","Dufresne","Singh","Grisham","Humbert","Einstein","Feynman","Marsalis","Fang","Chen","Charagundala"};

        // ARRAY - possible ethnicity options
        String[] ethnicities = {"Asian","Hispanic/Latino","White","Black/African American","Two or more races","Native American","Not Specified"};
        String[] fafsaOrNot = {"Y","N"};

        // ARRAY - subplans??
        String[] subPlans = {"BIOINFORM","INFASSUR","GAMEDEV",""};

        // ARRAY - possible gender options
        String[] genders     = {"M","F"};







        // output a "header" line that describes the data
        System.out.println("ID,Sex,Ethnic Grp,Name,Prim Prog,Acad Plan,Sub-Plan,Strt Level,Total,GPA,FAFSA,Take Prgrs,Fin Need");

        // creating a new Random object
        Random rng = new Random();
        for (int i=0; i<numNames; i++) {
            
        	// creating a new Student object
            Student s = new Student();
            
            // the rng.nextInt(lengthOfArray) is putting a cap on the random #s that can be generated 
            String name 			= "\"" + lastNames[rng.nextInt(lastNames.length)] + ", " + firstNames[rng.nextInt(firstNames.length)] + " " + middleInitials[rng.nextInt(middleInitials.length)] + "\"";
            double gpa 				= 1.0 + rng.nextDouble() * 3.0;
            String sex 				= genders[rng.nextInt(genders.length)];
            int studentID 			= rng.nextInt(999999) + 2000000;
            String ethnicGrp 		= ethnicities[rng.nextInt(ethnicities.length)];
            String fafsa 			= fafsaOrNot[rng.nextInt(fafsaOrNot.length)];
            String subPlan 			= subPlans[rng.nextInt(subPlans.length)];
            int strtLevel 			= rng.nextInt(40);
            double total 			= 4.0 * rng.nextInt(8);
            double takePrgrs 		= (double)(rng.nextInt(18)+1);
            double financialNeed 	= (double)(rng.nextInt(10000));
    
    		// Print out the actual data (which is being redirected to our csv file)
            System.out.println(studentID + "," + sex + "," + ethnicGrp + "," + name + 
                ",USCI,CSCI," + subPlan + "," + strtLevel + "," + total + "," + gpa + "," +
                fafsa + "," + takePrgrs + "," + financialNeed);

        }
    }


}//END CLASS





















