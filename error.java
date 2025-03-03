//Exceptional(errors) handling in java.
class error{
    /* static int a = 10;
     static int b=0;
     static int div =a/b;*/
    public static void main(String[]args){

        try{
            // try block rise the error
            int a = 10;
            int b=0;
            int div =a/b;
        }
        catch (ArithmeticException e){
            // catch block: solving the error
            System.out.println("Solving the error" );
        }
        finally {
            System.out.println("etiher error occured or not.but this code is executed successfully ");
        }


    }
}
