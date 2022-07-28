//Class,
//Object
//variables
//data types
//access modifiers
//JVM/JRE/JDK
//method/Function
//polymorphism
//abstraction
//inheritance
//Encapsulation

//Syntax for method/function
                    //retruntype <functionname>(){
                    // ----------------*******Statements********----------
                    // }
//Constructor- default constructor, Parameterized Constructor.
//This keyword
//Super Keyword.
//Exception- Compile Time exception and Runtime Exception.
//           Checked exceptions                         Unchecked Exception.
//           IOException- file reading/writing          Arithmatic Exception- Devide by Zero.
//           SQLException- At the time query execution  NullPointer Exception.
//           Syntax errors.                             ArrayOutOfBoundsException
//Exception is base class which extends Throwable class.
//Object - Base class program
//Try Catch block for exception handling.
//Hirarchy for Exception Handling.
//Child exceptions should be handled first before parent exception.
//Finally block is used for cleanup activity.
//Softwares needs to install.
//JDK
//Android Studio
//Intellij

public class HelloWorld {
    static int i1=10;
    public static void main(String[] args) {
        int i=10;
        Student student=new Student();
        System.out.println("Global World"+student.name);
        System.out.println("Static variable before Change: "+i1);
        i1=20;
        System.out.println("Static variable after change: "+i1);

        student.printname("Manish");

        System.out.println("Static var from Student: "+Student.statfromStudent);

        Student.statfromStudent=10;

        System.out.println("Static var from Student after change: "+Student.statfromStudent);
    }
}
