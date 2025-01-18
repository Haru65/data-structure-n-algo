import java.util.Arrays;
import java.util.Scanner;

public class twod {
    public static void main(String args[]){
        int[][] arr = new int[3][3];
        Scanner in = new Scanner(System.in);
        for(int i = 0;i < arr.length;i++){
            
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
        // for(int i = 0;i < arr.length;i++){
            
        //     for(int j = 0; j < arr[i].length; j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        // }
        for(int row = 0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
