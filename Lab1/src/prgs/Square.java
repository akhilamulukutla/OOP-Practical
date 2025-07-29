package prgs;
import java.util.*;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		for(int i=1;i<n;i++) {
			System.out.println("square root of " +i+ "is" + Math.sqrt(i));
		}
		sc.close();
	}

}
