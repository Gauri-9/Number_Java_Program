import java.util.*;
class UniqueDigit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		char c[] = s.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				map.put(c[i],map.get(c[i])+1);
			}
			else{
				map.put(c[i],1);
			}
		}
		for(Map.Entry<Character,Integer> entry : map.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry.getKey());
			}
			else{
				System.out.println("Not Unique Digit");
			}
		}
	}
}