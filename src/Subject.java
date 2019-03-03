//This Interface handles appending, deleting and notifying all Objects.
interface Subject{
public void append(Object obj); //Method to append the object 
public void delete(Object obj); // Method to delete the object 
public void notifyAllObjects(String s);  //Method to notify all the objects
}