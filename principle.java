import java.util.Scanner;

public class principle {
    public static void main(String[] args) {
        Scanner ak = new Scanner(System.in);
        int si, p, t, r, ta;
        System.out.println("Enter Principle Amount");
        p=ak.nextInt();
        System.out.println("Enter No.of years");
        t=ak.nextInt();
        System.out.println("Enter Rate of Interset");
        r=ak.nextInt();
        si=(p*t*r)/100;
        System.out.println("Total Interest  "+si+"Rs");
        ta=si+p;
        System.out.println("Total amount "+ta+"Rs");

    }
}
