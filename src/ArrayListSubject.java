import java.util.ArrayList;

//The Objects update method is called when the Subject changes
interface Object{
public void update(String name, String s);
}
//This class extends Subject interface.
class ArrayListSubject implements Subject{
private String course;  //name of the celebrity
private ArrayList<Object> students;  //list of students
public ArrayListSubject(String course) {
this.course = course;
students = new ArrayList<Object>();
}
//add follower to the celebrity's appended follower list
@Override
public void append(Object obj) {
students.add(obj);
System.out.println(obj + " has been added to the course " + course);
}
//remove follower from celebrity's appended follower list
@Override
public void delete(Object obj) {
students.remove(obj);
System.out.println(obj + " has dropped the course " + course);
}
//Notify all the appended students
@Override
public void notifyAllObjects(String announcement) {
for(Object follower : students)
{
follower.update(course, announcement);
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
class Follower implements Object{
private String studentName;
public Follower(String followerName) {
this.studentName = followerName;
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