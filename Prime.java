import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        System.out.println("hellow owlrd");
        
        int c = 2;
        Scanner scan = new Scanner(System.in);
        System.out.println("input  a integer");
        int a = scan.nextInt();
        scan.close();
        for(;c< a/2;c++){
            int temp;
            temp = a%c;
            if(temp==0){
                System.out.println("not prime");
                break;
            }
            else{
                System.out.println("is prime");
                break;
            }
        }
        
    }
}

