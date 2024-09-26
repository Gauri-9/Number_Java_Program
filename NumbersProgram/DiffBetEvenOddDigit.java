import java.util.Scanner;
class DiffBetEvenOddDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int oddsum = 0,evensum=0,d;
		while(n!=0){
			d = n%10;
			if(d%2==0){
				evensum += d;
			}
			else{
				oddsum += d;
			}
			n /= 10;
		}
		System.out.println("Difference Between  Even And Odd Digit Sum - "+Math.abs(evensum-oddsum));
	}
}