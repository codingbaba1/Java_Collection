class ListIMPL
{
	public static void main(String...s)
	{
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		Iterator itr=list.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}