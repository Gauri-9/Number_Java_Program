import java.util.Scanner;
class NeighbourDigittPower{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		String s = Integer.toString(n);
		int sum = 0;
		for(int i=0;i<s.length();i++){
			int current = Character.getNumericValue(s.charAt(i));
			int left = (i>0) ? Character.getNumericValue(s.charAt(i-1)) : 1;
			int right = (i<s.length()-1) ?  Character.getNumericValue(s.charAt(i+1)) : 1;
			sum += Math.pow(current,left+right);
		}
		System.out.println(sum);
	}
}