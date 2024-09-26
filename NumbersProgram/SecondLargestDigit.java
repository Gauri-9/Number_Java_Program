import java.util.Scanner;
import java.util.Arrays;

class SecondLargestDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		char c[] = s.toCharArray();
		Arrays.sort(c);
		System.out.println(Integer.parseInt(c[c.length]-2));
	}
}