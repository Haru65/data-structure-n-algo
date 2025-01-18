public class range {
    public static void main(String[] args) {
        int[] arc = {1,2,3,2,23,33,345,112,3344};
        int start = 2;
        int end = 5;
        int target = 1;
        int ans = search(arc, target, start, end);
        System.out.println(ans);
    }

    
static int search(int[] arr, int target,int start,int end ) {
    if (arr.length==0) {
        return -1;
        
    }
        for(int i = start;i<end;i++){
            int current = arr[i];
            if(current== target){
                return i;
            }
            
        }
           return -1;
    }
}
