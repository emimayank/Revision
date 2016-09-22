
public class Imp_String_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Hello xcb";
		String str2="exbc";
		int len1=str1.length();
		int len2=str2.length(),j=0;
		for(int i=0;i<len1&&j<len2;i++){
			if(str1.charAt(i)==str2.charAt(j)){
				j++;
			}
		}
		if(j==len2){
			System.out.println("Subsequence");
		}
		else{
			System.out.println("Not a Subsequence");
		}
	}

}
