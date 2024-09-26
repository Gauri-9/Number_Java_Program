import java.util.*;
class DigitSumPrime{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		while(n!=0){
			int d = n%10;
			sum = sum+d;
			n /= 10;
		}
		boolean f = true;
		for(int i=2;i*i<sum;i++){
			if(sum%i==0){
				f = false;
			}
		}
		if(!f){
			System.out.println("Not");
		}
		else{
			System.out.println("Prime");
		}
	}
}