import java.util.*;
class MyList
{
	public static void main(String...s)
	{
		LinkedList<Product> ll=new LinkedList<Product>();

		Product product1=new Product();
		product1.setId(10);
		product1.setName("Mouse");
		product1.setDesc("Logitech Mouse");
		product1.setPrice(3000);
		product1.setQty(10);
		ll.add(product1);

		Product product2=new Product();
		product2.setId(20);
		product2.setName("Keyboard");
		product2.setDesc("Logitech Keyboard");
		product2.setPrice(900);
		product2.setQty(20);
		ll.add(product2);

		Product product3=new Product();
		product3.setId(5);
		product3.setName("LCD");
		product3.setDesc("Samsung LCD");
		product3.setPrice(29999);
		product3.setQty(12);
		ll.add(product3);

		Collections.sort(ll,new NameComparator());

		Iterator itr=ll.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		Collections.sort(ll,new PriceComparator());

		itr=ll.iterator();

		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}
}