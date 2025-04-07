class practise {
     static void Method2(){
         System.out.println("this is method 2");
     }
     static int difference(int a, int b){
         return a*b;

     }
    void method3(){
         System.out.println("this is method 3");
    }
   static String name1 =("Adarsh");
    int b=200;//global
     static int c=300;//static
    public static void main(String[]args) {
        int a = 100;//local
        System.out.println(a);
        System.out.println(c);
        practise obj = new practise();
        System.out.println(obj.b);
        System.out.println(name1);
        practise ak = new practise();
        ak.Method2();
        practise object = new practise();
        object.method3();
        System.out.println("difference is :"+ difference (20,30));
    }

}
