
public class Method3 {
	public void area(int l, int b)
	{
		System.out.println("The area of Rectangle is: "+l*b);
	}
	public void area(int r)
	{
		System.out.println("The area of Circle is: "+3.14*r*r);
	}
	public static void main(String[] args) {
		Method3 m3 = new Method3();
		m3.area(6,3);
		m3.area(10);
	}
}
