import java.util.Arrays;

public class MinimumPlatfrom {
    
    public static void main(String[] args) {
        
        // int arr[] ={900, 940, 950, 1100, 1500, 1800};
        // int dep[] ={910, 1200, 1120, 1130, 1900, 2000};

        int arr[] ={900, 1235, 1100};
        int dep[] ={1000, 1240, 1200};

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0 , j =0 , count =0 , maxCount = 0 ;

        while(i<arr.length )
        {
           if(arr[i] <= dep[j])
               {
                 count ++;
                 maxCount = Math.max(count , maxCount);
                 i++;
               }
               else
               {
                 count--;
                 j++;
               }
        }

        System.out.println(maxCount);
    }
}
