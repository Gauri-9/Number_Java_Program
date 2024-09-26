import java.util.Scanner;
class ArmStrongNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int armstrong = 0,d,count=0;
		int temp = n;
		while(n!=0){
			d = n%10;
			count++;
			n = n/10;
		}
		n = temp;
		while(n!=0){
			d = n%10;
			armstrong = armstrong + (int)Math.pow(d,count);
			n = n/10;
		}
		if(armstrong==temp){
			System.out.println("ArmStrong Number");
		}
		else{
			System.out.println("Not ArmStrong Number");
		}
	}
}