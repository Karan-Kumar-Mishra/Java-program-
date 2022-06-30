import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int physics, chemistry, biology, math, computer;
		float total;
		System.out.println("enter the marks of physics-> ");
		physics = sc.nextInt();
		System.out.println("enter the marks of chemistry-> ");
		chemistry = sc.nextInt();
		System.out.println("enter the marks of biology-> ");
		biology = sc.nextInt();
		System.out.println("enter the marks of math -> ");
		math = sc.nextInt();
		System.out.println("enter the marks of computer -> ");
		computer = sc.nextInt();
		total = physics + chemistry + biology + math + computer;
		float per = (total / 500) * 100;
		System.out.println("Total number -> " + total);
		System.out.println(" percentage -> " + per);

		if (per > 90) {
			System.out.println(" Grade a");
		} else if (per > 80) {
			System.out.println(" Grade b");

		} else if (per > 70) {
			System.out.println(" Grade c");

		} else if (per > 60) {
			System.out.println(" Grade d");

		} else if (per > 40) {
			System.out.println(" Grade e");
		} else {
			System.out.println(" Grade f");

		}


	}
}