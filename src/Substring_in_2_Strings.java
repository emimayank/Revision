
public class Substring_in_2_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcde";
		String str2="bcd";
		for(int i=0;i<str1.length();i++){
			if(str2.charAt(0)==str1.charAt(i)){
				checkSub(str1,str2,i);
			}
		}
	}

	private static void checkSub(String str1, String str2, int index) {
		// TODO Auto-generated method stub
		int initialIndex=index;
		for(int i=0;i<str2.length();i++){
			if(str1.charAt(index)==str2.charAt(i)){
				index++;
			}
			else{
				break;
			}
		}
		if((index-initialIndex)==str2.length()){
			System.out.println("Substring");
		}
	}

}
