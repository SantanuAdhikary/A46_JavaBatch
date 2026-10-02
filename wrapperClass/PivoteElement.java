public class PivoteElement {
    
    public static int findPivot(int arr[])
    {
             int s = 0 ; 
        int e = arr.length-1;

        while(s<e)
        {
            int mid = s + (e-s)/2 ; 

            if(arr[mid] > arr[0])
                s = mid + 1 ;
            else 
                e = mid;
        }
        return e;
    }
    public static void main(String[] args) {
        System.out.println("hi");
        int arr[] = {8,13,40,50,1,2,3};
       
        int index = findPivot(arr);

        System.out.println("pivot index is "+index);
        System.out.println("pivot element is "+arr[index]);

    }
}
