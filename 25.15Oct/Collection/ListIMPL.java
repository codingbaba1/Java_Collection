import java.util.*;
class ListIMPL
{
	public static void main(String...s)
	{
		Vector<String> list = new Vector<String>(5);
		list.add("Cebs");
		list.add("Renu");
		list.add("Vivek");
		list.add("Tushar");
		Collections.sort(list);
		Iterator iterator=list.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}
}