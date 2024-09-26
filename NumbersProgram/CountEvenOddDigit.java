import java.util.Scanner;
class CountEvenOddDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d,evencount=0,oddcount=0;
		while(n!=0){
			d = n%10;
			if(d%2==0){
				evencount++;
			}
			else{
				oddcount++;			
			}
			n = n/10;
		}
		System.out.println(evencount+" "+oddcount);
	}
}