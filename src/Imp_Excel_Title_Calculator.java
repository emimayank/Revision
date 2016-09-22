//Exact Opposite of the Index Calculator, lines 9, 10,11 from here is reverse of that in line 9 there
// n-- corresponds to +1
// Remember AscII though only 65 needed here, 65-A, 97-a, 48-0
public class Imp_Excel_Title_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=173;
		String str=new String();
		while(n!=0){
			n--;
			str=(char)(n%26+'A')+str;
			n=n/26;
		}
		System.out.println(str);
	}

}
