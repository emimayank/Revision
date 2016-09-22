import java.util.HashMap;

class LList2{
	public int val;
	public LList2 next;
	public LList2(int val, LList2 next){
		this.val=val;
		this.next=next;
	}
}
public class Imp_Linked_List_Duplicate_Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList2 l1=new LList2(1,null);
		LList2 l2=new LList2(2,l1);
		LList2 l3=new LList2(7,l2);
		LList2 l4=new LList2(4,l3);
		LList2 l5=new LList2(5,l4);
		LList2 l6=new LList2(6,l5);
		LList2 l7=new LList2(7,l6);
		HashMap<Integer, Integer>map=new HashMap<>();
		LList2 from=l7;
		LList2 start=l7;
		LList2 prev=null;
		//LList2 from=prev;
		while(start!=null){
			if(map.containsKey(start.val)){
				prev.next=start.next;
				start=prev;
			}
			map.put(start.val,1);
			prev=start;
			start=start.next;
		}
		while(from!=null){
			System.out.println(from.val);
			from=from.next;
		}
	}

}
