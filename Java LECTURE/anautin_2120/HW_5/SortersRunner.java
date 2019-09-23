import java.util.ArrayList;



public class SortersRunner {

    

    public static void main(String[] args) {

        String[] dogNames = { "Butch", "Fifi", "Spot", "Fido", "Bella", "Pepper", "Rocky", "Mac", "Happy", "Buffy" };
        

        ArrayList<Dog> myDogs = new ArrayList<Dog>();
        
        // as I add dogs from my array to my array list, I create the actual dog objects
        // I am passing in a name and a weight
        for (int i=0; i < dogNames.length; i++) {
            myDogs.add(new Dog(dogNames[i], 80.0 - i*7));
        }

        
        // will loop through the entire array list and print out each dog object using toString() method
        System.out.println("initial state");
        for (Dog d : myDogs)
            System.out.println(d);


        Sorters2120.bubbleSort(myDogs);

        System.out.println("after sort");
        for (Dog d : myDogs)
            System.out.println(d);

    }


}//END CLASS
