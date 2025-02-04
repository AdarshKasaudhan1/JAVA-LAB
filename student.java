import java.io.*;
 class teacher {
     int id;
     String name;
}
class student{
     int id=10;
     String name ="Adarsh";
     void fun(){
         System.out.print("trainer");
     }

} class mainclass{
     public static void main(String[] args){
         student s=new student();
         System.out.println(s.id+" "+s.name);
         teacher t=new teacher();
         t.id=101;
         t.name="Adarsh";
         System.out.print (t.id+" "+t.name);
     }
}
