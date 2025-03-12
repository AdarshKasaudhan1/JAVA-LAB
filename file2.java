//file handling in java:create and write
import java.io.FileWriter;
import java.io.IOException;
public class file2 {
    public static void main(String[]args){
        try {
            FileWriter java = new FileWriter("Siri.txt");
            java.write("Object-Oriented Programming or Java OOPs concept refers to programming languages that use objects in programming. They use objects as a primary source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks you assign.");
            java.close();
            System.out.println("java file is created");
        }
        catch(IOException e){
            System.out.println("Error: file is not created");
            e.printStackTrace();
        }
    }
}
