package binarysearch;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,66,78};
        int target = 50;
        System.out.println(search(arr, target)); 
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid ;
        while (start<=end) {
           mid = start + (end - start)/2;
             
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid + 1;

            }
            else{
                return mid ;
            } 
            
        }
        return arr[end];
        
        
        
    }
}
