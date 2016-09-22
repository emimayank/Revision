class LList1{
	public int val;
	public LList1 next;
	public LList1(int val, LList1 next){
		this.val=val;
		this.next=next;
	}
}
public class Imp_LinkedList_Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LList1 l1=new LList1(1,null);
		LList1 l2=new LList1(2,l1);
		LList1 l3=new LList1(3,l2);
		LList1 l4=new LList1(4,l3);
		LList1 l5=new LList1(5,l4);
		LList1 l6=new LList1(6,l5);
		LList1 l7=new LList1(7,l6);
		
		LList1 curr=l7;
		LList1 prev=null;
		LList1 next=null;
		while(curr!=null){
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		while(prev!=null){
			System.out.println(prev.val);
			prev=prev.next;
		}

	}

}
