import java.util.*;
class tempCodeRunnerFile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number of AP: ");
		int a=sc.nextInt();
		System.out.print("Enter common difference: ");
		int c=sc.nextInt();
		System.out.print("Enter number of terms: ");
		int d=0;
		for (int b=sc.nextInt(); b>0; b--) {
			d+=a;
			a+=c;
		}
		System.out.print("Sum: "+d);
	}
}
