import java.util.*;
class DiffBetLargeSmall{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		char c[] = s.toCharArray();
		Arrays.sort(c);
		System.out.println(c[c.length-1]-c[0]);
	}
}
