import java.util.Scanner;
class ReverseNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0,d,rev=0;
		while(n!=0){
			d = n%10;
			rev = rev*10+d;
			n /= 10;
		}
		System.out.println("Reverse Number - "+rev);
	}
}