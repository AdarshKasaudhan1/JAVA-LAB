// custom exception class
class Checkgender extends Exception{//exception class 01
    Checkgender(){//exception class 02
        super("Give valid gender...");
    }
}
 class ext2 {
         //Exception method inside main class
          public static void checkValid (String gender) throws Checkgender {
             if (gender.equals("male")) {
                 System.out.println("Gender is male...");
             }
             else if (gender.equals("female")) {
                 System.out.println("Gender is female...");
             }
             else {
                 throw new Checkgender();
             }
         }
     public static void main(String[]args){
         // create try and catch block
         try{
             checkValid("male");
         }
         catch (Checkgender e){
             System.out.println("Caught Exception: "+e.getMessage());
         }
     }
 }
