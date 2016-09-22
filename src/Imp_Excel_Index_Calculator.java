
public class Imp_Excel_Index_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="AAAABBBBCCCZ";
		int sum=0;
		for(int i=0;i<str.length();i++){
			sum=sum*26+(str.charAt(i)-'A'+1);		
		}
		System.out.println(sum);
	}

}
