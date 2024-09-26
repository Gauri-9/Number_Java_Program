import java.util.Scanner;
import java.util.Arrays;

class ReplaceDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		String s1 = Integer.toString(n1);
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		String s3 = s1.replace(Integer.toString(n2),Integer.toString(n3));
		System.out.println(Integer.parseInt(s3));
	}
}

