class MyProductCompare
{
	public static void main(String...s)
	{
		Product product1=new Product();
		product1.setId(10);
		product1.setName("Mouse");
		product1.setDesc("Logitech Mouse");
		product1.setPrice(3000);
		product1.setQty(10);
	

		Product product2=new Product();
		product2.setId(20);
		product2.setName("Keyboard");
		product2.setDesc("Logitech Keyboard");
		product2.setPrice(900);
		product2.setQty(20);
		

		if(product1.compareTo(product2)>0)
		{
			System.out.println("Price of product one is greater");
		}
		else if(product1.compareTo(product2)<0)
		{
			System.out.println("Price of product two is greater");
		}
		else
		{
			System.out.println("Both product have same price");
		}
	}
}