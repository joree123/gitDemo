import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Object> s=new LinkedHashSet<>();//store heterogeneous data
s.add("kiran");
s.add("MAnu");

s.add(1);
s.add("gitdemo1");
System.out.println(s);
Iterator<Object> is=s.iterator();
while(is.hasNext())
{System.out.println(is.next());

	}

}}
