import java.util.Scanner;
class IncrementDigitByOne{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = n;
		int count= 0;
		String s2 = "";
		while(n!=0){
			int d = n%10;
			count++;
			n /= 10;
		}
		for(int i=0;i<count;i++){
			s2 = s2+'1';
		}
		int n2 = Integer.parseInt(s2);

		System.out.println(temp+n2);
	}
}