public class Modifier
{
	int a=12;
	private int g=122;
	public int b=34;
	protected int k=64;
public static void main(String args[])
	{
		Modifier obj= new Modifier();
		System.out.println(obj.a);
		System.out.println(obj.g);
		System.out.println(obj.b);
		System.out.println(obj.k);
	}
}