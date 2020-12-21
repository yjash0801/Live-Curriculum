
public class TypeCasting {
	public static void main(String[] args) {
		System.out.println("Implicit Type Casting:");
		char a = 'J';
		System.out.println("Value of a: "+a);
		int b = a;
		System.out.println("Value of b: "+b);
		float c = a;
		System.out.println("Value of c: "+c);
		long d = a;
		System.out.println("Value of d: "+d);
		double e = a;
		System.out.println("Value of e: "+e);
		System.out.println("\n");
		System.out.println("Explicit Type Casting:");
		double p = 104.23;
		System.out.println("Value of p: "+p);
		long q = (long)p;
		System.out.println("Value of q: "+q);
		float r = (float)p;
		System.out.println("Value of r: "+r);
		int s = (int)p;
		System.out.println("Value of s: "+s);
		char t = (char)p;
		System.out.println("Value of t: "+t);
	}
}
