import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class listusingcar{
    public static void  main(String[]args) {
        Scanner ask1 = new Scanner(System.in);//scanner class
        List<String> Car1 = new ArrayList<>();
        System.out.println("Car Details");
        System.out.println("------------------");
        System.out.println("My Car:" + Car1);


        List<String> Car2 = new ArrayList<>();
        System.out.println("Car Details2");
        System.out.println("------------------");
        System.out.println("My Car2:" + Car2);
    }
}