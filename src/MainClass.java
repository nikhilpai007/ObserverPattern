public class MainClass {
public static void main(String[] args) {
	System.out.println("::::::::::::::::::::::::: Trent University - Blackboard:::::::::::::::::::::::::::: \n");
ArrayListSubject COIS3040H = new ArrayListSubject("COIS3040H");
ArrayListSubject COIS3400H = new ArrayListSubject("COIS3400H");
ArrayListSubject COIS4000H = new ArrayListSubject("COIS4000Y");

Follower Nikhil = new Follower("Nikhil Pai");
Follower Sean = new Follower("Sean Behan");
Follower Daniel = new Follower("Daniel Devine");
Follower Nicholas =  new Follower("Nicholas Barnes");
Follower Natasha = new Follower("Natasha Prytulka");

COIS3040H.append(Nikhil);
COIS3040H.append(Sean);
COIS3400H.append(Nikhil);
COIS3400H.append(Nicholas);
COIS4000H.append(Daniel);
COIS4000H.append(Natasha);

COIS4000H.announcement("What exciting ideas do you have for the software project this year?");
COIS4000H.delete(Natasha);
COIS3040H.announcement("Learn all the Design Patterns for the final exam");
COIS3400H.delete(Nicholas);
COIS3400H.announcement("Monday's class cancelled due to Bad weather conditions in peterborough ");
}
}