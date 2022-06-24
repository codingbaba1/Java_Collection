import java.util.*;
class MyLinkedHashSet
{
	public static void main(String...s)
	{
		Set<String> set=new LinkedHashSet<String>();


		set.add("Rajat");
		set.add("Parul");
		set.add("Pakhi");
		set.add("Renu");
		set.add("Aseem");
		set.add("Vivek");
		set.add("Parul");
	
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}