import java.util.*;
public class Main {
	public static void main(String[] args) {
		StringBuffer str1,str2,str3;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string =>");
		str1=new StringBuffer(sc.nextLine());
		System.out.println("capacity of string is =>"+str1.capacity());
		str1.ensureCapacity(50);
		System.out.println("  minmum capacity of string "+str1.capacity());
		System.out.println("length of  string "+str1.length());
		System.out.println("enter the second String to append =>");
		str2= new StringBuffer(sc.nextLine());
		str1.append(str2);
		System.out.println("after appending string =>"+str1);
		System.out.println("enter the string to insert =>");
		str2= new StringBuffer(sc.nextLine());
		int pos;
		System.out.println("enter the postion => ");
		pos=sc.nextInt();
		str1=str1.insert(pos,str2);
		System.out.println("after insert string "+str1);
		System.out.println("enter the position of begin to delete string ");
		int x=sc.nextInt();
		System.out.println("enter the position of end to delete string =>");
		int y=sc.nextInt();
		System.out.println("string for deletetion =>"+str1.substring(x,y));
		str1=str1.delete(x,y);
		System.out.println("after deleteing string =>"+str1);
		str1=str1.reverse();
		System.out.println(" reverse =>"+str1);
	}
}













