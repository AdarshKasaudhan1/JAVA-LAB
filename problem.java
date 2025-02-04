import java.util.Scanner;
public class problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. copies");
        int copy = sc.nextInt();
        System.out.println("Enter sell price");
        int sellprice = sc.nextInt();
        System.out.println("Enter cost price ");
        int costprice = sc.nextInt();
        int profit = (copy * sellprice) - (copy  * costprice) - 100;
        System.out.println("Profit: " + profit);
    }

}