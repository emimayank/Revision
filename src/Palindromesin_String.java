
public class Palindromesin_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="Hello BoB how the fuck acdca arammara";
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++){
			checkPalin(arr[i]);
		}
	}

	private static void checkPalin(String str) {
		// TODO Auto-generated method stub
		String temp=new String();
		for(int i=0;i<str.length();i++){
			temp=str.charAt(i)+temp;
		}
		if(temp.equals(str)){
			System.out.println(str);
		}
	}

}
