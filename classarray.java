import java.util.Scanner;

public class classarray {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
    //    int[] numberr = {2,2,3,2,4241,532,5241,31,35,2,52,31,4,2,53,6,476,5,87,5,234};
        int[] numberr = new int[10];
       for(int j = 0;j<numberr.length;j++){
        numberr[j] = in.nextInt(6);
       }
       
       
       for(int i = 0; i < numberr.length;i++){
        System.out.print(" "+numberr[i]);
       } 
    

    }
}
