JAVA II
Homework #2
(Observer Pattern)


@author			Abby Autin
@version		September 17, 2018




\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
CLIENT FUNCTIONALITY

- Any clients of this application would be able create Pokemon players and Pokemon trainers.
- Pokemon players can fight each other, and take damage to their health
- Any pokemon trainer that registers itself as an observer of a pokemon(s), would automatically receive printed statements alerting them of an attack made to their pokemon observable 


\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

Background :::

- Dr. Summa provided us with full implementation of class Pokemon, PokemonTrainer, and WhatHappened
- Class Pokemon extended its superclass, Observable (java.util)
- Class PokemonTrainer implemented the interface, Observer (java.util)
- Class WhatHappened represented an incident/fight between two Pokemon objects




\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

COMPILE & EXECUTE INSTRUCTIONS :::




To compile:

1. Compile all .java files in your directory (where this application is stored)

javac *java




To execute:

2. Run PokemonTester

java org.junit.runner.JUnitCore PokemonTester



\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

Assignment Objective :::


JUNIT
- Create a JUnit Tester class to test the method implementation of the methods in our Pokemon, PokemonTrainer, and WhatHappened classes.
- Since this application produces print statements (output) whenever the attack() method is invoked inside of class Pokemon, we as the developers, must relocate that expected output when testing that particular method.
- Dr. Summa provided some implementation details that we would need to insert into our JUnit tester in order for us to successfully redirect that expected output, and ultimately have a successful test upon execution. 



OBSERVABLE/OBSERVER
- Once we have run our unit tester, we need to "reverse engineer" class Observable.
- This means, we will need to create our own version of class Observable and interface Observer
- Based on the ways in which our application was originally designed to interact with class Observable and interface Observer, we should be able to infer the implementation details for each of the methods that are outlined in the Java API for class Observable


- So, after we have identified the necessary implementation for these methods and have actually written out that implementation, we will go into our Pokemon class to change the class from which we are extending to reflect our newly created class, MyObservable
- And, we will also go into our PokemonTrainer class to change the interface we are implementing to reflect our newly created interface, MyObserver


- Assuming that we have implemented MyObservable and MyObserver correctly, we should be able to run our JUnit tester again and have our tests pass successfully. 




\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

Design Information:



DESIGN: OBSERVER PATTERN 
- This assignment has a focus on the Observer Pattern in Java
- This pattern is used whenever an object needs to receive notifications following a state change of some other object
- To differentiate between the notifier and the notified parties, we label the curious objects as "Observers" and we label the persons of interest at "Observables."
- Now that we've identified the roles of these different objects, we must design their blueprints in a specific manner that will allow these notification messages to be sent(from the Observable) and to be received (by the Observer)



DESIGN: JUNIT TESTER
- In this specific application, we are using "Interactive Methods."
- This means that we have methods that are designed to either take in information from the user and/or print out information to the user; thus making them interactive in nature
- Since these methods are not just performing back-end operations, we are forced to test them in a different manner
- In this particular application, our methods are designed to print out a String message to the Observer anytime their Observables have changed
- However, we as the developers, can't test those kinds of methods the way we normally would
- Therefore, in this case, we will use something called "Redirection" inside of our testing file
- So, instead of the program's output being "printed" to the screen, we will instruct it to "redirect" that output to a buffer. That buffer can then be converted to a String, which we will then have the ability to compare to a String literal in our testing file. 
- Thus, our tester class will indeed function like all of our other tester classes: it will tell us whether or not one String is equal to another String.
- And if those two String are indeed equal to each other, this lets us know (as the developers) that the Observers were successfully notified when their Observable had changed.
- Which also lets us know (as the developers) that our code was implemented properly because it functions just as it was designed to function, based on the Observer pattern. 




\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

GENERATE CUSTOM APIs FOR YOUR CLASSES:



>> step_1:

To generate HTML code based on your own source code:

cd into your directory that houses your source code files

>> step_2

type the following command:

java doc -d <name of directory> *java


=====================================================