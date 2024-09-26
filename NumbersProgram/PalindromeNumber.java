import java.util.Scanner;
class PalindromeNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0,d,rev=0;
		int temp = n;
		while(n!=0){
			d = n%10;
			rev = rev*10+d;
			n /= 10;
		}
		if(rev==temp){
			System.out.println("Palindrome Number");
		}
		else{
			System.out.println("Not Palindrome Number");
		}
	}
}