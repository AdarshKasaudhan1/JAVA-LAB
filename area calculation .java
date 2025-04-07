import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner ak=new Scanner(System.in);
        int length, breath, area, perimeter;
        System.out.println("Enter the length");
        length=ak.nextInt();
        System.out.println("Enter the breath");
        breath=ak.nextInt();
        area=length*breath;
        System.out.println("Area is sq " +area+ " sq");
        perimeter=2*(length+breath);



    }
    }
