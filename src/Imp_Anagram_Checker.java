import java.util.Arrays;
import java.util.HashMap;

public class Imp_Anagram_Checker {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer>map=new HashMap<>();
		String str1="anagram";
		String str2="nagarma";
		char ch1[]=str1.toCharArray();
		char ch2[]=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2)){
			System.out.println("Anagrams");
		}
		else{
			System.out.println("Not Anagrams");
		}
		
	}

}
