import java.util.*;
class MySet1
{
	public static void main(String...sk)
	{
		Set<String> s=new HashSet<String>();

		s.add("cebs");
		s.add("renu");
		s.add("swati");


		for(String var:s)
		{
			System.out.println(var);
		}
	}
}