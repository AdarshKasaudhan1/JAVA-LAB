 abstract class Animal2 {
    public  void dog_details(){

    }
 }
 class dog1 extends Animal2{
    public void Dog_details(){
        String m= "SHIRO";
        String n="Greman Sepherd";
        String b="50000";
        String v="NEPAL";
        String c="Adarsh ";
        String x="BOW BOW";

        System.out.println("Dog Name is "+m);
        System.out.println("-----------------");
        System.out.println("Dog Bread is "+n);
        System.out.println("Dog Price is "+b);
        System.out.println("Dog Loation is "+v);
        System.out.println("Dog Owner is "+c);
        System.out.println("Dog Sound is "+x);

    }
 }
 class Animal1{
    public static  void main(String[]args){
        dog1 obj = new dog1();
        obj.Dog_details();
    }
 }
