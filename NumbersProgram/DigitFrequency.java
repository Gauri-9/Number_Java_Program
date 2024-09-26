import java.util.*;
class DigitFrequency{
	public static void main(String[] args) {
		Scanner	 sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = Integer.toString(n);
		char c[] = s.toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<c.length;i++){
			if(map.containsKey(c[i])){
				map.put(c[i],map.get(c[i])+1);
			}
			else{
				map.put(c[i],1);
			}
		}

		for(Map.Entry<Character,Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
}