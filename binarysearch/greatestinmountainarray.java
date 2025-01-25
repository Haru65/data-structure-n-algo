//not submiited due to some isssues 
package binarysearch;
public class greatestinmountainarray {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,3,1};
        int target = 3; 
        int ans = findInMountainArray(target,arr);
        System.out.println(ans);
    }
   static  int findInMountainArray(int target, int [] arr) {
    int start = 0;
    int end = arr.length-1;
    int mid = -1;
   
    while (start <=end) {
        mid = start +(end -start)/2;
        if (arr[mid]> arr[mid +1]) {
             end = mid ;
            
          }
          else {
            start = mid +1;

          }
          return start;
        }
          


      return mid;
    }
}
