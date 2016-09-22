
public class Longest_substring_no_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcabcbb",temp=null;
		String longest=new String();
		for(char ch:str.toCharArray()){
			if(longest.contains(ch+"") && longest!=null){
				if(longest.length()>=temp.length()){
					temp=longest;
					longest=null;
				}
			}
			else{
				longest=longest+ch;
			}
		}
		System.out.println(longest);
	}

}
