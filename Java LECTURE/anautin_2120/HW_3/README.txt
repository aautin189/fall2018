JAVA II
Homework #3
(Serialization)


@author			Abby Autin
@version		September 29, 2018




\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

OBJECT classes
1. Student
2. StudentDatabase

STATIC classes
1. StudentDatabaseCSVFileReader
2. StudentDatabaseCSVFileWriter
3. StudentDatabaseSerializedFileReader
4. StudentDatabaseSerializedFileWriter
5. StudentIO

RUNNER classes
1. MakeRandomStudents
2. ReadSortAndWriteStudentDataFromCSVFile

TESTER class
1. StudentDatabaseConversionTester 


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

PROVIDED FILES :::

- Dr. Summa provided us with the following fully-implemented classes: Student, StudentDatabase, MakeRandomStudents, ReadSortAndWriteStudentDataFromCSVFile, StudentDatabaseCSVFileReader

- He provided the class StudentDatabaseCSVFileWriter with some instructions for us to finish the implementation he had provided for the write method

- A tester class was supposed to be provided for this assignment. However, we did not receive this file until about a day prior to deadline



FILES TO BE CREATED :::

- StudentDatabaseIO
- StudentDatabaseSerializedFileReader
- StudentDatabaseSerializedFileWriter

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

CLIENT FUNCTIONALITY :::



Writing:
- Should be able to take Student objects stored in an array list and write their state out to an OS file as text data
- Should also be able to write their state out to an OS file as binary data (using serialization)


Reading:
- Should be able to take a text file and upload its contents back into the program in object form and store back into an array list (as the objects originally were)
- Should also be able to take a binary file and upload its contents back into the program in object form and store back into an array list (using deserialization)

- Should be able to sort that array list according to GPA values


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\



COMPILE & EXECUTE INSTRUCTIONS :::




To compile:

1. Compile all .java files in your directory (where this application is stored)

javac *java




To execute:

2. Run StudentDatabaseConversionTester

java org.junit.runner.JUnitCore StudentDatabaseConversionTester



\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\