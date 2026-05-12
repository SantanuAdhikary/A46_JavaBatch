import java.util.Arrays;
import java.util.HashMap;

class A
{
    public static void main(String[] args) {
        
        int arr[] ={6,6,6,4,3,3};

        int key = 6 ;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : arr)
        {
            if(map.containsKey(ele))
                map.put(ele,map.get(ele)+1);
            else
                map.put(ele,1);
        }

        System.out.println(map);

        int n = arr.length;
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=0 ; j<n-1-i;j++)
            {
                if(map.get(arr[j]) > map.get(arr[j+1]))
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0 ; i<n ;i++)
        {
            if(arr[i] == key)
            {
                System.out.println(i);
                break;
            }
        }
    }
}