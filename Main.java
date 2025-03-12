//file handling in java: Writing a file
import java.io.FileWriter;
import java.io.IOException; // exception means error in files
public class Main{
    public static void main(String[] args) {
        try{
            FileWriter java = new FileWriter("java.txt"); // creating and writing a file
            java.write("Java is a High Level Programming Language");
            java.close();
            System.out.println("Java File Created and Writing is Finish");
        }catch(IOException e){
            System.out.println("File is Not Created : Error");
            e.printStackTrace();
        }

    }
}