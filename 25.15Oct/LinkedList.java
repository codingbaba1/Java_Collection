class LinkedList<E> implements Collection<E>,Iterator<E>
{
	class Node
	{
		E data;
		Node next;
	}
	Node start,prv,curr;
	public boolean isEmpty()
	{
		return start==null;
	}
	public void add(E data)
	{
		Node node = new Node();
		node.data=data;
		node.next=null;
		if(isEmpty())
		{
			start=node;
		}
		else
		{
			curr=start;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=node;
		}
	}
	public boolean remove(int pos)
	{
		if(isEmpty())
		{
			return false;
		}
		else
		{
			curr=start;
			int i=1;
			while(curr!=null && i!=pos)
			{
				prv=curr;
				curr=curr.next;
				i++;
			}
			if(pos==i)
			{
				if(start==curr)
				{
					start=curr.next;
				}
				else
				{
					prv.next=curr.next;
				}
				return true;
			}
			else
			{
				return false;
			}
		}
	}
	public Iterator iterator()
	{
		LinkedList<E> l=new LinkedList<E>();
		l.curr=this.start;
		return l;
	}
	public boolean hasNext()
	{
		return this.curr!=null;
	}
	public E next()
	{
		E temp=this.curr.data;
		this.curr=this.curr.next;
		return temp;
	}
	public void clean()
	{
		start=null;
	}
}






