import java.util.Scanner;
class SumOfDigitNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0,d;
		while(n!=0){
			d = n%10;
			sum += d;
			n /= 10;
		}
		System.out.println("Sum of Digit - "+sum);
	}
}