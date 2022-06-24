class ArrayDemo
{
	void sequenceCount(int arr[])
	{
		int cnt=1,i;
		for(i=0;i<arr.length-1;i++)
		{
			if(arr[i]==arr[i+1])
			{
				cnt++;
			}
			else
			{
				System.out.println(arr[i]+" occ at "+cnt);
				cnt=1;
			}
		}
		System.out.println(arr[i]+" occ at "+cnt);

	}
	public static void main(String...s)
	{
		new ArrayDemo().sequenceCount(new int[]{1,1,1,2,2,3,3,3,3,8});
	}
}