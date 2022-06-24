import java.util.*;
class MyMap
{
	public static void main(String...s)
	{
		Map<Integer,String> map=new HashMap();


		map.put(100,"Renu");
		map.put(108,"Aseem");
		map.put(102,"Parul");
		map.put(109,"Pakhi");
		map.put(104,"Tushar");
		

		System.out.println(map.get(109));
	}
}