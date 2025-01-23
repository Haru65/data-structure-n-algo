package binarysearch;

import java.util.Arrays;

public class firstandlast {
    public static void main(String[] args) {
        int nums [] ={5,7,7,8,8,10};
        int target = 5;
        
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    static int[] searchRange(int nums[],int target){
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int nums[],int target,boolean FirstOccurance){
        int start = 0;
        int end = nums.length-1;
        int ans = -1 ;
        int mid ;
        while(start<= end){
           mid = start + (end - start)/2;
            if(nums[mid] >target){
               
                end = mid - 1;
            }
            else if (nums[mid]<target) {
             
                start = mid +1;
                
            }
            else{
                ans = mid;
                if(FirstOccurance){
                    end = mid - 1;
                }
                else{
                    start = mid +1;
                }

            }
        }
        return ans;
    }
}
