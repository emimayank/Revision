
public class Number_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=-222;
		//int num2=111;
		int palin=checkPalin(num1);
		if(palin==num1){
			System.out.println("palindrome");
		}
		else{
			System.out.println("Not PAlindrome");
		}
	}

	private static int checkPalin(int num) {
		// TODO Auto-generated method stub
		int n=0;
		while(num!=0){
			n=(n*10)+(num%10);
			num=num/10;
		}
		return n;
	}

}
