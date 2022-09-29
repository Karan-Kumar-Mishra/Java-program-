import java.io.*;
import java.util.*;
class product extends Exception {
	int sellQuantity;
	int availableQuantity;
	int p_id;
	int cost;
	int sellPrice;
	public void inputdata() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sellquantity =>> ");
		sellQuantity = sc.nextInt();
		System.out.println("enter the availableQuantity =>> ");
		availableQuantity = sc.nextInt();
		System.out.println("enter the product id =>> ");
		p_id = sc.nextInt();
		System.out.println("enter the cost =>>");
		cost = sc.nextInt();
		System.out.println("enter the price =>>");
		sellPrice = sc.nextInt();

		try {
			if (availableQuantity < sellQuantity) {
				throw new product();
			}
		} catch (Exception e) {
			System.out.println("Exception ::  sell quantity is more than available quantity ?");
		}
	}
	public void display() {
		System.out.println("sellQuantity =>>" + sellQuantity);
		System.out.println("availableQuantity =>> " + availableQuantity);
		System.out.println("p_id=>>  " + p_id);
		System.out.println("cost =>>" + cost);
		System.out.println("sellPrice =>>" + sellPrice);
	}
}
//question on Exception
public class Main {
	public static void main(String[] args) {
		product p1 = new product();
		p1.inputdata();
		p1.display();
	}
}




