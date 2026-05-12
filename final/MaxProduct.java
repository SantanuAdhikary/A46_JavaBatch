public class MaxProduct {
    public static void main(String[] args) {
        
        // int arr[] ={2,3,-2,4};
        int arr[] ={-2, 6, -3, -10, 0, 2};
        int max = arr[0] , min = arr[0], ans = arr[0];

        for(int i=1 ; i<arr.length ; i++)
        {   
            if(arr[i] < 0)
            {
                int t = max ; 
                max = min ; 
                min = t;
            }
            max = Math.max(arr[i], arr[i] * max);
            min = Math.min(arr[i], arr[i] * min);
            ans = Math.max(max, ans);
        }
        System.out.println(ans);
    }
}
