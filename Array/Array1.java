class  Array1
{
	public static void main(String[] args) 
	{
		
		String friends[] = new String[6];
		
		int age[] = new int[6];
		
		friends[0] = "joey";
		friends[1] = "ross";
		friends[2] = "chandler";
		friends[3] = "rachel";
		friends[4] = "monica";
		friends[5] = "phebe";
		//friends[6] = "ganther";
		
		System.out.println(friends[0]);
		System.out.println(friends[1]);
		System.out.println(friends[2]);
		System.out.println(friends[3]);
		System.out.println(friends[4]);
		System.out.println(friends[5]);
		//System.out.println(friends[-1]);
		
		
		System.out.println("length of friends array : "+friends.length);
		
		int n = friends.length;
		
		for(int i=0 ; i<n;i++ )
		{
			System.out.println(friends[i]);
		}
	}
}

