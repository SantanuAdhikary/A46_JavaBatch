public class Subarray {
    
    public static void main(String[] args) {
        
        // int arr[] ={2,3,-2,4};
        int arr[] ={-2, 6, -3, -10, 0, 2};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i ; j<n ;j++)
            {
                int sum = 1 ;
                for(int k=i ; k<=j ; k++)
                {
                    System.out.print(arr[k] + " ");
                    sum *= arr[k];
                    maxSum = Math.max(sum,maxSum);
                }
                System.out.println( " sum is : "+sum);
            }
        }

        System.out.println("MAX IS "+maxSum);
    }
}
