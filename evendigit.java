public class evendigit {
    public static void main(String[] args) {
      int[] nums = {12,345,2,6,7894,26} ;  
      System.out.println(FindNums(nums));
    }
    static int FindNums(int[] nums){
        int count = 0;
        for(int num : nums){
            if(Even(num)){
              count ++;  
            };
            
        }
        return count;
    }
    static boolean Even(int num){
        int Numberofdigits = Digits(num); 
        if(Numberofdigits % 2 == 0){
            return true;
        }
        return false;
    }
    static int Digits(int num){
        int count = 0;
        while (num>0) {
            num = num/10;
            count ++;
        };
        return count;
    }
}
