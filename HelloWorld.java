import java.util.Arrays;


public class HelloWorld {

	boolean uniqueChars(String input){
		if(input.length() > 256)
			return false;
		
		boolean []array = new boolean[256]; 
		
		for(int i = 0; i < input.length(); i++){
			int value = input.charAt(i);
			
			if(array[value]){
				return false;
			}
			else{
				array[value] = true;
			}
		}
		
		return true;
	}
	static void reverse(String str){
		StringBuffer buffer = new StringBuffer();
		
		for(int i = str.length();i > 0; i--){
			buffer.append(str.charAt(i-1));
		}
		str = buffer.toString();
		System.out.println(str);
	}
	static String reverseRecursive(String str){
		if(str.length() == 1){
			return str;
		}
		return str.charAt(str.length()-1) + reverseRecursive(str.substring(0,str.length()-1));
	}
	static boolean isSubstring(String a, String b){
		if(b.length() > a.length()){
			String temp = b;
			b = a;
			a = temp;
		}
		
		for(int i = 0; i + b.length() - 1  < a.length(); i++){
				if(a.substring(i, i+b.length()).equals(b))
						return true;
		}
		
		return false;
	}
	static boolean permutation(String a, String b){
		if(b.length() != a.length()){
			return false;
		}
		
		a = sort(a);
		b = sort(b);
		if(a.equals(b))
			return true;
		
		return false;
			
	}
	private static String sort(String b) {
		char[] t = b.toCharArray();
		Arrays.sort(t);
		return new String(t);
	}
	
	static boolean permutationF(String a, String b){
		if(b.length() != a.length()){
			return false;
		}
		int charCountsA[] = new int[256];
		int charCountsB[] = new int[256];
		
		for(int i = 0; i < a.length(); i++){
			charCountsA[a.charAt(i)]++;
			charCountsB[b.charAt(i)]++;
		}
		
		for(int i = 0; i < 256; i++){
			if(charCountsA[i] != charCountsB[i]){
				return false;
			}
		}
		
		return true;
	}
	
	static char[] replaceString(char[] str){
		
		for(int i = 0; i < str.length; i++){
			
		}
		
		return str;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("chad");
		if((isSubstring("waterbottlewaterbottle","erbottlewat")))
			System.out.println(reverseRecursive("chady"));

	}

}
