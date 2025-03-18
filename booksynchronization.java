////book details
//import java.sql.SQLOutput;
//import java.util.Scanner;
//class Details{
//    void head(){
//        System.out.println("BOOK DETAILS");
//        System.out.println("------------------");
//
//    }
//    synchronized void library(String detail){
//        System.out.print("["+detail);
//
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
//        System.out.println("]");
//    }
//}
//class MyThread1 extends Thread {
//    Details print_bk;
//    String det;
//
//    MyThread1(Details print_bk, String det) {
//        this.print_bk=print_bk;
//        this.det = det;
//
//    }
//    public void run(){
//        print_bk.library(det);
//    }
//}
//public class booksynchronization{
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter Book Name:");
//        String book_name = s.nextLine();
//        System.out.println("Enter Book Price");
//        String book_price = s.nextLine();
//        System.out.println("Enter Book Publish Date");
//        String book_publish_date = s.nextLine();
//        System.out.println("Enter Book Author Name");
//        String book_author = s.nextLine();
//
//        Details d = new Details();
//        d.head();
//
//
//        //MyThread1 b1 = new MyThread1(d,"Book Details");
//        //MyThread1 b2 = new MyThread1(d,"------------------------------------");
//        MyThread1 b3 = new MyThread1(d,"Book Name:"+book_name);
//        MyThread1 b4 = new MyThread1(d,"Book Author:"+book_author);
//        MyThread1 b5 = new MyThread1(d,"Book Publish Date:"+book_publish_date);
//        MyThread1 b6 = new MyThread1(d,"Book Price:"+book_price);
//
//        //b1.start();
//        //b2.start();
//        b3.start();
//        b4.start();
//        b5.start();
//        b6.start();
//
//    }
//}