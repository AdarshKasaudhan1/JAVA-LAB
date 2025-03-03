/*class Main{
    public static void main (String[]args){
        //int[] array = {1, 2, 3, 4, 5};// creating array in java
       // System.out.println("First elements of array is:" + array[1]);
        try {
            int[] array = {1, 2, 3, 4, 5};// creating array in java
            System.out.println("First elements of array is:" + array[10]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is out of bound");
        }
    }
}*/
//Multiple errors can handle using one try block, more than one catch blocks
class Practice{
    public static void main(String[] args) {
        try{
            //arithmetic exception
            int a = 10;
            int b= 0;
            int div = a/b;

            int div1 = 10/0;
            System.out.println("Division :"+div);
            //ArrayIndexOutOfBoundsException

            int[] array = {1,2,3,4,5};
            System.out.println("My array :"+array[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Cant possible by 10/0");


        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound :"+e);

        }
        finally {
            System.out.println("Both errors are solved...!!");


        }
    }
}