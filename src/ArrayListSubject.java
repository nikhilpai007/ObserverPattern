import java.util.ArrayList;

//The update method is called when the Subject changes
interface Object{
public void update(String name, String s);
}
//This class extends Subject interface.
class ArrayListSubject implements Subject{
private String course;  //name of the courses
private ArrayList<Object> students;  //list of students
public ArrayListSubject(String course) { //constructor 
this.course = course; 
students = new ArrayList<Object>(); // Creating an ArrayList of objects
}
//append students to the courses list 
@Override
public void append(Object obj) { 
students.add(obj); //adding objects (students) to the ArrayList
System.out.println(obj + " has been added to the course " + course); //printing the output for append 
}
//deleting (dropping) a course by student
// Basically deleting object -student from the course 
@Override
public void delete(Object obj) {
students.remove(obj); //removing the object (student)
System.out.println(obj + " has dropped the course " + course); //printing the output for deleting 
}
//Notify all the appended students
@Override
public void notifyAllObjects(String announcement) {
for(Object student : students)
{
student.update(course, announcement);
}
System.out.println();
}
//This method updates the announcement.
// It will internally call notifyAllObjects(announcement) method
//after updating the announcement.
public void announcement(String announcement)
{
System.out.println("\nAnnouncement from " + course + "=>  " + announcement + "\n");
notifyAllObjects(announcement);
}
}
// This class extends Object interface.
class student implements Object{
private String studentName;
public student(String studentName) {
this.studentName = studentName;
}
//This method will be called to update all students regarding the new announcement posted by celebrity.
@Override
public void update(String course , String announcement) {
System.out.println(studentName + " has received the announcement from "+ course + "=>  "+  announcement);
}
@Override
public String toString() {
return studentName;
}
}