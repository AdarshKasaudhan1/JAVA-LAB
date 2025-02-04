public class operator {
    public static void main(String[]args){
        int a=10,b=20;
        //Arithmetic operator
        System.out.println(a+b);//30
        System.out.println(a-b);//-10
        System.out.println(a*b);//200
        System.out.println(b/a);//2
        System.out.println(a%b);//10
        //comparison operator
        System.out.println(a<b);//true
        System.out.println(a>b);//false
        System.out.println(a>=b);//false
        System.out.println(a<=b);//true
        System.out.println(a==b);//false
        System.out.println(a!=b);//true
        //Assignment operator
        int c=10,s=30;
        c+=20;
        s+=c;
        System.out.println(c+s);//90
        //logical operator &&,||,!
        boolean e=true;
        System.out.println(a ==20 && b==40);//false
        System.out.println(a==20||b==45);//false
        System.out.println(a==10||b==40);//true
        System.out.println(!e);//false
        //unary operator
        System.out.println(a++);//10
        System.out.println(++a);//12
        System.out.println(a);//12
        System.out.println(++a);//13
        System.out.println(a++);//13
        System.out.println(a--);//14
        System.out.println(--a);//12
        System.out.println(a);//12
    }
}
