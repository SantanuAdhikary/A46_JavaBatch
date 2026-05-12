import java.lang.reflect.Array;
import java.util.Arrays;

public class Mergesort {

    public static void merge(int[] arr, int start,int mid, int end)
    {
        int c[] = new int[end-start+1];
        int i = start , j = mid+1 , k=0;
        
        while(i<=mid && j<=end)
            {
                if(arr[i]<= arr[j])
                c[k++] = arr[i++];
            else
                c[k++] = arr[j++];
        }
        
        while(i<=mid)
            c[k++] = arr[i++];
        
        while(j<=end)
            c[k++] = arr[j++];
        
        int m=start;
        
     for(int n=0 ; n<c.length;n++)
     {
         arr[m] = c[n];
         m++;
     }

    }
    
    public static void divide(int[] arr,int start, int end)
    {
          if(start < end)
          {
             int mid = (start + end ) / 2 ;
             divide(arr, start, mid);
             divide(arr, mid+1, end);
             merge(arr,start,mid,end);
          }
    }
   public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,4};
        int n = arr.length;
        divide(arr,0,n-1);

        System.out.println(Arrays.toString(arr));
   }
}
