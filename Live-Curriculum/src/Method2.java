
public class Method2 {
	int A = 50;
	public int display(int C)
	{
		int B = A-C;
		return B;
	}
	public static void main(String[] args) {
		Method2 m2 = new Method2();
		System.out.println("The value before calling diplay: "+m2.A);
		m2.display(30);
		System.out.println("The value after calling display: "+m2.A);
	}
}
