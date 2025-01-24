package binarysearch;


public class infinitearr {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,8,9,10,12,13};
        int target = 13;
        int res = window(nums, target);
        System.out.println(res );
    }
    static int window(int[] nums,int target ){
        int start = 0;
        int end = 2;
        int mid = -1;
        while(start<= end){
            mid = start +(end -start)/2;
            if(target >nums[mid]){
                start = end  +1 ;
                end = end  * 2;
               }
                else{
                   
                    if(target < nums[mid]){
                        end = mid - 1;
                    }
                    else if(target>nums[mid]){
                        start = mid + 1;
        
                    }
                    else{
                        return mid ;
                    } 
                   
                } 
        } return mid;



    }


}
