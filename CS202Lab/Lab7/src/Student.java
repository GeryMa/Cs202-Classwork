public class Student extends Person {
    int studentID;
    public Student(int studentID, String name){
        this.studentID = studentID;
        this.name = name; 
    }
}
/*
Create two new classes, one called Person that will be the superclass, and a subclass called Student.
Person should have one String member variable called name, and a constructor to set its member variable.
Student should have one int member variable called studentID, and one constructor to set ALL its member variables.
Add main to Person and create a variable called var1 of type Student. Use its constructor to set the name to switchaplatypus and its studentID to 195.
Output var1's value for name. Then output its value for studentID.
 */