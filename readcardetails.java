import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
class readcardetails{
    public static void main(String[]args){
        try{
            FileReader ak=new FileReader("Car_details.txt");
            BufferedReader ask=new BufferedReader(ak);
            String java;
            while((java = ask.readLine()) != null){
                System.out.println(java);
            }
            ask.close();
            ak.close();
        }
        catch (IOException e){
            System.out.println("file not found");
            e.printStackTrace();
        }
    }
}