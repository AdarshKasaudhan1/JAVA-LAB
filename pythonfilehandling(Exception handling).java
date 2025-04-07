import java.io.FileWriter;
import java.io.IOException; // exception means error in files
public class pythonfile{
    public static void main(String[] args) {
        try {
            FileWriter Python = new FileWriter("AdarshFile.txt");
            Python.write("Python is an Interpreted Language");
            Python.close();
            System.out.println("Python oops file is created");
        }catch(IOException e){
            System.out.println("File is Not created : Error");
            e.printStackTrace();
        }
    }
}
