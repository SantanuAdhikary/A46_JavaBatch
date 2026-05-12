class AddElements 
{
	public static void main(String[] args) 
	{
		int arr[] = {10,20,30,40,50,60};
		
		int sum = 0 ; 
		
		for(int i=0 ; i<arr.length ; i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("sum is : "+sum);
	}
}


// int arr[] ={1,5,2,8,42,12,11};

// 1.  multiply all the array elements 
// 2.  add only the even elements
// 3.  multiply only the odd elements