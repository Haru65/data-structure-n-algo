import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
    int[][] arc = {{1,2,3},{4,5,6},{7,8,9}};  
    int[] ans = search(arc,8) ;
    System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        
        if (arr.length == 0) {
            return new int[]{-1} ;
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        
        return new int[]{-1};
    }
}
