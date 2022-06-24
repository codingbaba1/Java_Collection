class Product implements Comparable<Product>
{
	private int id;
	private String name;
	private String desc;
	private int qty;
	private double price;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setDesc(String desc)
	{
		this.desc=desc;
	}
	public String getDesc()
	{
		return desc;
	}
	public void setQty(int qty)
	{
		this.qty=qty;
	}
	public int getQty()
	{
		return qty;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}	
	@Override
	public int compareTo(Product p)
	{
		return this.name.compareTo(p.name);
	}
	@Override
	public String toString()
	{
		return id+"\t"+name+"\t"+desc+"\t"+price+"\t"+qty;
	}
}





