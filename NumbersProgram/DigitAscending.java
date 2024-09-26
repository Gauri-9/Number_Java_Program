import java.util.Scanner;
import java.util.Arrays;

class DigitAscending{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		char c[] = s.toCharArray();
		Arrays.sort(c);
		String s2 = new String(c);
		int num2 = Integer.parseInt(s2);
		System.out.println(num2);
	}
}