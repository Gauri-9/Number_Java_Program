import java.util.Scanner;
class ProductDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prod = 1,d;
		while(n!=0){
			d = n%10;
			prod *= d;
			n /= 10;
		}
		System.out.println(prod);
	}
}