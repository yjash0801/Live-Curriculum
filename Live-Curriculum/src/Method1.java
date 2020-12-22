
public class Method1 {
	public int display(int a, int b)
	{
		int c = a*b;
		return c;
	}
	public void display1(int x)
	{
		int d = x;
		System.out.println("The value display1: "+d);
	}
	public float display2(int p, int q, int r)
	{
		float f = (float)(p*q)/r;
		return f;
	}
	public static void main(String[] args) {
		Method1 M1 = new Method1();
		int dis = M1.display(10,4);
		float dis2 = M1.display2(2, 3, 4);
		System.out.println("The value display: "+dis);
		M1.display1(7);
		System.out.println("The value display2: "+dis2);
	}
}
