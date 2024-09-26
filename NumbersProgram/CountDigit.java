import java.util.Scanner;
class CountDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d,count=0;
		while(n!=0){
			d = n%10;
			count++;
			n = n/10;
		}
		System.out.println(count);
	}
}