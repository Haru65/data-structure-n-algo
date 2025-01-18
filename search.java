public class search {
public static void main(String[] args) {
  int [] arrr ={1,2,3,4,232,234,5,535,53,5,3,3,42,342,4,325,35,3};
    int target = 5;
    int ans = Find(arrr,target);
    System.err.println(ans);
}

static int Find(int[] arr, int target ) {
if (arr.length==0) {
    return -1;
    
}
    for(int i = 0;i<arr.length;i++){
        int current = arr[i];
        if(current== target){
            return i;
        }
        
    }
       return -1;
}
    
}