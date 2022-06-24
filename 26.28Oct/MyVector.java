import java.util.*;
class MyVector
{
	public static void main(String...s)
	{
		Vector<String> vect=new Vector<String>(5);

		vect.add("Parul");
		vect.add("Rajat");
		vect.add("Aseem");
		vect.add("Renu");
		vect.add("Swati");
		vect.add("Pakhi");
		
		ListIterator itr=vect.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		System.out.println("\n\n");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}

		/*Iterator itr=vect.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		Enumeration e=vect.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}*/
	}
}










