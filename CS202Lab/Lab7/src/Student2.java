public class Student2 extends Person2{

    @Override
    void outputInfo() {
        System.out.println("I am a student");
        
    }
    
}
/*Create a class, MainClass with empty main
Create abstract class called Person
Give Person an abstract method, outputInfo with no return value & no params.
Create a child class of Person called Instructor.
Implement outputInfo in Instructor, outputting: I am an instructor.
Create a child class of Person called Student.
Implement outputInfo in Student to output: I am a student
In MainClass, create a static method, getPerson with no parameters and returns a Person. This method should:
Output the prompt: Enter I for instructor (otherwise student)
Use Scanner to get input
If the user entered I, create and return an Instructor object
Otherwise, create & return a Student object
In main use getPerson method to create/set a new Person variable, p
Use p's outputInfo */