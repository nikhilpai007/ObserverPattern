public class MainClass { // Class for the main program
public static void main(String[] args) { // Main method 
	System.out.println("::::::::::::::::::::::::: Trent University - Blackboard:::::::::::::::::::::::::::: \n"); //Design
ArrayListSubject COIS3040H = new ArrayListSubject("COIS3040H"); //creating a new arraylist named COIS3040H
ArrayListSubject COIS3400H = new ArrayListSubject("COIS3400H"); //creating a new arraylist named COIS3400H
ArrayListSubject COIS4000H = new ArrayListSubject("COIS4000Y"); //creating a new arraylist named COIS400Y

student Nikhil = new student("Nikhil Pai"); //creating new object for student to add to the arraylist 
student Sean = new student("Sean Behan"); //creating new object for student to add to the arraylist 
student Daniel = new student("Daniel Devine"); //creating new object for student to add to the arraylist 
student Nicholas =  new student("Nicholas Barnes"); //creating new object for student to add to the arraylist 
student Natasha = new student("Natasha Prytulka"); //creating new object for student to add to the arraylist 

COIS3040H.append(Nikhil); // Appending object to the arraylist 
COIS3040H.append(Sean); // Appending object to the arraylist 
COIS3400H.append(Nikhil); // Appending object to the arraylist 
COIS3400H.append(Nicholas); // Appending object to the arraylist 
COIS4000H.append(Daniel); // Appending object to the arraylist 
COIS4000H.append(Natasha); // Appending object to the arraylist 

COIS4000H.announcement("What exciting ideas do you have for the software project this year?"); //Creating new announcement 
COIS4000H.delete(Natasha); // Deleting object from the arraylist 
COIS3040H.announcement("Learn all the Design Patterns for the final exam"); //Creating new announcement 
COIS3400H.delete(Nicholas); // Deleting object from the arraylist 
COIS3400H.announcement("Monday's class cancelled due to Bad weather conditions in Peterborough "); //Creating new announcement 
}
}