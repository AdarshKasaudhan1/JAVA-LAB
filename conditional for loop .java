public class conditional {
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(i);
        }
        for(int i=0; i<=10; i++){
            System.out.println(i);
            i++;
        }
        for(int i=1; i<=10; i++){
            System.out.println(i);
            i++;
        }
        for(int i=1; i<=10; i++){
            System.out.println(i*i);
        }
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        for (int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println((i*i)-2);
            }
            else {
                System.out.println((i*i)-1);
            }
        }
    }
}
