package prgs;


public class Tom {
	public static void main(String[] args) {
		int t=3,j=5;
		System.out.println("Before Swapping:");
		System.out.println("Tom has " +t+ " apples");
		System.out.println("Jerry has " +j+ " apples");
		int temp=t;
		t=j;
		j=temp;
		System.out.println("After Swapping:");
		System.out.println("Tom has " +t+ " apples");
		System.out.println("Jerry has " +j+ " apples");
	}

}
