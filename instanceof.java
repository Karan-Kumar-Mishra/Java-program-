import java.util.*;
import java.io.*;
abstract class Temp {

}

class A extends Temp {

}
class B extends Temp {

}
public class Main {
	public static void main(String[] args) {
		Temp obj1;
		obj1 = new A();
		if (obj1 instanceof A) {
			System.out.println("object of A");
		} else {
			System.out.println("object of B");
		}
		obj1 = new B();
		if (obj1 instanceof A) {
			System.out.println("object of A");
		} else {
			System.out.println("object of B");
		}

	}
}