import java.util.Scanner;
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
		System.out.println(id+" "+name);
	}
}

public class Constructors {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Id's and Names: ");
	Std std1 = new Std(31440, "Jashwanth");
	Std std2 = new Std(30613, "Sasank");
	std1.display();
	std2.display();
		}
}
