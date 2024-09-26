import java.util.Scanner;
import java.util.Arrays;

class RemoveDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String s1 = Integer.toString(n1);
		int n2 = sc.nextInt();
		String s2 = Integer.toString(n2);
		String s3 = s1.replace(s2,"");
		System.out.println(s3);
	}
}

