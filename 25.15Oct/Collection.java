interface Collection<E>
{
	boolean isEmpty();
	void add(E data);
	boolean remove(int pos);
	Iterator iterator();
	void clean();
}