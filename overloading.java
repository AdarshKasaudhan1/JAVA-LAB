import java.util.Scanner;
import java.io.*;
class ak{

}
class bak{
    int a = 12;
    void function(){
        System.out.println("method1");
    }
    void function(int a){
        System.out.println(1.5+a);
    }
    int function(int a, int b){
        return a+b;
    }
    float function1(float a) {
        return a * a;
    }
}
public class overloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bak b1 = new bak();
        b1.function();
        b1.function(12);
        b1.function(12, 3);
        b1.function(12, 3);
        b1.function1(12);

    }
}