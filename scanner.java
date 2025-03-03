import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//creating scanner classSuraj
        List<String> ak = new ArrayList<>(); // creating list
        while(true){
            System.out.println("Enter the names of  animals:(type 'done' to finish) ");
            String animal= s.next();
            if(animal.equalsIgnoreCase("done")){
                break;
            }
            ak.add(animal);
        }

        System.out.println("Animal are: " + ak);
    }
}
