package binarysearch;

import java.util.Arrays;

public class pivot {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6,7,1,2};
        int target = 4;
        int result = search(nums,target);
        System.out.println(result +  "final result");

    }

    
    static int search(int[] nums, int target) {
        int start = 0;
        int peak = findPivot(nums);
        
        int result = searcharray(nums, target, start, peak -1);
        System.out.println(result + "results of search");
        if(result == -1){
             return searcharray(nums, target, peak , nums.length-1);
        }
        return result;
    }
    static int findPivot(int []nums){
        int start = 0;
        int end = nums.length-1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
          System.out.println("pivot is "+start);
        return start;
        
    }
    static int searcharray(int[]nums,int target,int start,int end){
      
        System.out.println("Searching from index " + start + " to " + end);
        System.out.println(Arrays.toString(nums));

        while (start<=end) {
           int  mid = start +(end -start)/2;
           System.out.println("mid is "+mid);
            if (nums[mid]>target) {
                end = mid - 1;
            }
            else if (nums[mid]< target ){
                start = mid + 1;
            }
            else{
                return mid;
            }
            
        }
        
        return -1;
    }
}
