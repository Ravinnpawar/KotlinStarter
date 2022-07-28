public class Student {
    String name ="Aayush";
    static int statfromStudent =5;
    int rollNumber=1220;

    void printname(String name) {
        System.out.println(name);
        System.out.println("Global Variables"+this.name);
    }
}
