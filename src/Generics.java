
public class Generics<T extends Number> {
	T t1,t2;
	public Generics(T t1,T t2)
	{
		this.t1=t1;
		this.t2=t2;
	}
	public T getType()
	{
		return t1;
	}
	public void showType() {
		System.out.println(t1.getClass().getName());
	}
	public int add() {
		return (t1.intValue()+t2.intValue());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Generics<String> s=new Generics<String>("Hello world","sdg");
		s.showType();
		Generics<Character> c=new Generics<Character>('d','s');
		c.showType();
		Generics<Phone> p=new Generics<Phone>(new Phone(),new Phone());
		p.showType();*/;
		Generics<Integer> gs=new Generics<Integer>( 3, 5);
		
		
	}
	


}
